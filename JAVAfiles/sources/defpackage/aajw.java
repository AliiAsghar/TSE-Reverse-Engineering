package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugPrefsItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajw implements View.OnClickListener, DialogInterface.OnClickListener {
    public final TextView a;
    public final TextView b;
    public String c;
    public Object d;
    public aaju e;
    private final DebugPrefsItemView f;
    private EditText g;

    public aajw(DebugPrefsItemView debugPrefsItemView) {
        this.f = debugPrefsItemView;
        View findViewById = debugPrefsItemView.findViewById(R.id.title);
        findViewById.getClass();
        this.a = (TextView) findViewById;
        View findViewById2 = debugPrefsItemView.findViewById(R.id.text_value);
        findViewById2.getClass();
        this.b = (TextView) findViewById2;
        debugPrefsItemView.setOnClickListener(this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj;
        dialogInterface.getClass();
        EditText editText = this.g;
        if (editText != null) {
            String str = null;
            this.g = null;
            String obj2 = editText.getText().toString();
            try {
                Object obj3 = this.d;
                if (obj3 instanceof String) {
                    obj = obj2;
                } else if (obj3 instanceof Integer) {
                    obj = Integer.valueOf(Integer.parseInt(obj2));
                } else if (!(obj3 instanceof Long)) {
                    return;
                } else {
                    obj = Long.valueOf(Long.parseLong(obj2));
                }
                aaju aajuVar = this.e;
                aaju aajuVar2 = aajuVar;
                if (aajuVar == null) {
                    arro.b("listener");
                    aajuVar2 = null;
                }
                String str2 = this.c;
                if (str2 == null) {
                    arro.b("key");
                } else {
                    str = str2;
                }
                aajuVar2.a(str, obj);
                return;
            } catch (NumberFormatException unused) {
                return;
            }
        }
        throw new IllegalStateException("activeEditText null in onClick");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        Object obj = this.d;
        String str = null;
        if (obj instanceof Boolean) {
            obj.getClass();
            Boolean valueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
            this.d = valueOf;
            aaju aajuVar = this.e;
            if (aajuVar == null) {
                arro.b("listener");
                aajuVar = null;
            }
            String str2 = this.c;
            if (str2 == null) {
                arro.b("key");
            } else {
                str = str2;
            }
            aajuVar.a(str, valueOf);
            return;
        }
        EditText editText = new EditText(this.f.getContext());
        this.g = editText;
        editText.setText(this.b.getText());
        editText.setFocusable(true);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f.getContext());
        String str3 = this.c;
        if (str3 == null) {
            arro.b("key");
            str3 = null;
        }
        builder.setTitle(str3).setView(editText).setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
    }
}
