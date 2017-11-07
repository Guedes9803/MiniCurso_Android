import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.guedes.teste01.R;

/**
 * Created by IFSP- on 07/11/2017.
 */

public class NoteActivity extends Activity{
    @Override
    protected void OnCreate(@Nullable Bundle savedInstanceState) {
        super.OnCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        final EditText edtTextTitle =
                findViewById(R.id.edt_title);

        final EditText edtTextDescription =
                findViewById(R.id.edt_description);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NoteActivity.this,text:edtTextTitle.getText() + " " + edtTextDescription.getText(), Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
