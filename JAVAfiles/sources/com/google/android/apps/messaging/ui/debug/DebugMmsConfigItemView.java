package com.google.android.apps.messaging.ui.debug;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aajp;
import defpackage.klv;
import defpackage.xar;
import defpackage.xas;
import defpackage.xbe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DebugMmsConfigItemView extends LinearLayout implements View.OnClickListener, DialogInterface.OnClickListener {
    public TextView a;
    public TextView b;
    public Switch c;
    public String d;
    public EditText e;
    public String f;
    public String g;
    public int h;
    public aajp i;

    public DebugMmsConfigItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aajp aajpVar = this.i;
        String str = this.d;
        String obj = this.e.getText().toString();
        int i2 = this.h;
        Object obj2 = aajpVar.a.b.get(str);
        if (obj2 != null) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                if ((i3 != 0 && i3 != 1 && i3 != 2 && i3 != 3) || obj2.equals(obj)) {
                    return;
                }
            } else {
                throw null;
            }
        }
        xbe.z(aajpVar.a.b, i2, str, obj);
        xbe.z(aajpVar.b.d, i2, str, obj);
        aajpVar.c.put(str, new xas(obj, xar.DEBUG_MENU));
        aajpVar.notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.text_value);
        this.c = (Switch) findViewById(R.id.switch_button);
        setOnClickListener(this);
        this.c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = getContext();
        if (this.d.equals("How do I use this debug tool?")) {
            StringBuilder sb = new StringBuilder("This is a list of carrier configs used for the mcc/mnc set in the upper left corner.");
            for (xar xarVar : xar.values()) {
                sb.append(" Configs labeled with \"(");
                sb.append(xarVar.j);
                sb.append(")\" come from source: ");
                sb.append(xarVar.name());
                sb.append(".");
            }
            new AlertDialog.Builder(context).setTitle("Carrier Config Debug Menu").setMessage(sb.toString()).create().show();
            return;
        }
        int i = this.h;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    new AlertDialog.Builder(context).setTitle(this.f).setMessage(String.valueOf(this.c.isChecked())).setMessage(this.g).create().show();
                    return;
                } else if (i2 != 2 && i2 != 3) {
                    if (i2 == 4 || i2 == 5) {
                        new AlertDialog.Builder(context).setTitle(this.f).setMessage(this.b.getText()).create().show();
                        return;
                    }
                    return;
                }
            }
            EditText editText = new EditText(context);
            this.e = editText;
            editText.setText(this.b.getText());
            this.e.setFocusable(true);
            EditText editText2 = this.e;
            int i3 = this.h;
            if (i3 != 0) {
                editText2.setInputType(i3 == 4 ? 524288 : 3);
                AlertDialog create = new AlertDialog.Builder(context).setTitle(this.f).setView(this.e).setMessage(this.g).setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
                create.setOnShowListener(new klv((LinearLayout) this, context, 4));
                create.show();
                return;
            }
            throw null;
        }
        throw null;
    }
}
