package com.example.exemplo2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void gravar1(View v){
        HelperDB ch = null;  // a classe derivada de SQLiteOpenHelper
        SQLiteDatabase bdw = null;
        try {
            ch = new HelperDB(getApplicationContext());
            bdw = ch.getWritableDatabase();
            EditText nome = (EditText) findViewById(R.id.nome);
            EditText celular = (EditText) findViewById(R.id.cel);
            EditText email = (EditText) findViewById(R.id.email);
            String n = nome.getText().toString();
            String c = celular.getText().toString();
            String e = email.getText().toString();
            if(n.isEmpty() || c.isEmpty() || e.isEmpty()) {
                Toast.makeText(getApplicationContext(),
                        "Por favor, preencha os dados.",Toast.LENGTH_LONG).show();
            }
            else {
                bdw.execSQL("INSERT INTO contatos (nome,celular,email) "
                        + "  values ('" + n + "','" + c + "','" + e + "')");
                Toast.makeText(getApplicationContext(),
                        "Inserido com sucesso.",Toast.LENGTH_LONG).show();
            }
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "\nErro processando o BD. Nome duplicado?\n",
                    Toast.LENGTH_LONG).show();
        }
        finally {
            if(bdw!=null) bdw.close();
            if(ch!=null) ch.close();
        }
    }

    public void listar(View v){
        HelperDB ch1 = null;  // a classe derivada de SQLiteOpenHelper
        SQLiteDatabase bdr1 = null;
        String str= "\nContatos cadastrados\n\n";
        try {
            Context ctx = this;  // ou: Context ctx = v.getContext(); dentro de onClick
            ch1 = new HelperDB(ctx);
            bdr1 = ch1.getReadableDatabase();
            Cursor cursor = bdr1.query("contatos", null, null, null, null, null, null);
            // ou Cursor cursor = bdr.rawQuery("select * from contatos", null);
            while (cursor.moveToNext()) {
                String nom = cursor.getString(0);
                String cel = cursor.getString(1);
                String em = cursor.getString(2);
                str += nom + ", "  + cel + ", "  + em + "\n\n";
            }
            ((TextView)findViewById(R.id.lista)).setText(str);
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "\nErro processando o BD.\n", Toast.LENGTH_LONG).show();
        }
        finally {
            if(bdr1!=null) bdr1.close();
            if(ch1!=null) ch1.close();
        }
    }


    public void atualizar(View v){
        HelperDB ch = null;  // a classe derivada de SQLiteOpenHelper
        SQLiteDatabase bdw = null;
        try {
            ch = new HelperDB(getApplicationContext());
            bdw = ch.getWritableDatabase();
            EditText nome = (EditText) findViewById(R.id.nome);
            EditText celular = (EditText) findViewById(R.id.cel);
            EditText email = (EditText) findViewById(R.id.email);
            String n = nome.getText().toString();
            String c = celular.getText().toString();
            String e = email.getText().toString();
            if(n.isEmpty()) {
                Toast.makeText(getApplicationContext(),
                        "Por favor, preencha o nome do contato que deseja atualizar",Toast.LENGTH_LONG).show();
            } else if(!(c.isEmpty()) && e.isEmpty()){
                ContentValues cv = new ContentValues();
                cv.put("celular", c);
                long id = bdw.update("contatos", cv, "nome = '"+n+"'", null);
                if(id == -1) {
                    Toast.makeText(getApplicationContext(), "\nNão foi possível inserir. Nome duplicado?\n",
                            Toast.LENGTH_LONG).show();
                }else if(id == 0){
                    Toast.makeText(getApplicationContext(), "\nNão foi possível Atualizar. Dado não encontrado\n",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Atualização realizada com sucesso",Toast.LENGTH_LONG).show();
                }
            } else if(c.isEmpty() && !(e.isEmpty())){
                ContentValues cv = new ContentValues();
                cv.put("email", e);
                long id = bdw.update("contatos", cv, "nome = '"+n+"'", null);
                if(id == -1) {
                    Toast.makeText(getApplicationContext(), "\nNão foi possível inserir. Nome duplicado?\n",
                            Toast.LENGTH_LONG).show();
                }else if(id == 0){
                    Toast.makeText(getApplicationContext(), "\nNão foi possível Atualizar. Dado não encontrado\n",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Atualização realizada com sucesso",Toast.LENGTH_LONG).show();
                }
            }
            else {
                ContentValues cv = new ContentValues();
                cv.put("nome", n);
                cv.put("celular", c);
                cv.put("email", e);
                long id = bdw.update("contatos", cv, "nome = '"+n+"'", null);
                if(id == -1) {
                    Toast.makeText(getApplicationContext(), "\nNão foi possível inserir. Nome duplicado?\n",
                            Toast.LENGTH_LONG).show();
                }else if(id == 0){
                    Toast.makeText(getApplicationContext(), "\nNão foi possível Atualizar. Dado não encontrado\n",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Atualização realizada com sucesso",Toast.LENGTH_LONG).show();
                }
            }
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "\nErro processando o BD. \n",
                    Toast.LENGTH_LONG).show();
        }
        finally {
            if(bdw!=null) bdw.close();
            if(ch!=null) ch.close();
        }
    }

    public void deletar(View v){
        HelperDB ch = null;  // a classe derivada de SQLiteOpenHelper
        SQLiteDatabase bdw = null;
        try {
            ch = new HelperDB(getApplicationContext());
            bdw = ch.getWritableDatabase();
            EditText nome = (EditText) findViewById(R.id.nome);
            String n = nome.getText().toString();
            if(n.isEmpty()) {
                Toast.makeText(getApplicationContext(),
                        "Por favor, preencha o nome do contato que deseja Eliminar",Toast.LENGTH_LONG).show();
            }
            else {
                long id = bdw.delete("contatos", "nome = '"+n+"'", null);
                if(id == -1) {
                    Toast.makeText(getApplicationContext(), "\nNão foi possível inserir. Nome duplicado?\n",
                            Toast.LENGTH_LONG).show();
                }else if(id == 0){
                    Toast.makeText(getApplicationContext(), "\nNão foi possível Eliminar. Dado não encontrado\n",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Eliminação realizada com sucesso.",Toast.LENGTH_LONG).show();
                }
            }
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "\nErro processando o BD. \n",
                    Toast.LENGTH_LONG).show();
        }
        finally {
            if(bdw!=null) bdw.close();
            if(ch!=null) ch.close();
        }
    }

}
