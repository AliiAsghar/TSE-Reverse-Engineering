package com.google.android.apps.messaging.ui.debug;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.a;
import defpackage.aajm;
import defpackage.klv;
import defpackage.xzb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DebugGServiceKeysItemView extends LinearLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, DialogInterface.OnClickListener, View.OnLongClickListener {
    public EditText a;
    private TextView b;
    private TextView c;
    private Switch d;
    private String e;
    private String f;
    private aajm g;

    public DebugGServiceKeysItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(String str, String str2, String str3, boolean z, aajm aajmVar) {
        char c;
        this.g = aajmVar;
        this.e = str;
        this.f = str2;
        this.b.setText(str);
        this.b.setTypeface(null, z ? 1 : 0);
        switch (str2.hashCode()) {
            case -891985903:
                if (str2.equals("string")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 104431:
                if (str2.equals("int")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3029738:
                if (str2.equals("bool")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3327612:
                if (str2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 97526364:
                if (str2.equals("float")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1 && c != 2 && c != 3 && c != 4) {
                this.c.setVisibility(8);
                this.d.setVisibility(8);
                xzb.g("Bugle", a.cg(str, str2, "Unexpected keytype: ", " key: "));
                return;
            } else {
                this.c.setVisibility(0);
                this.d.setVisibility(8);
                this.c.setText(str3);
                return;
            }
        }
        this.d.setVisibility(0);
        this.c.setVisibility(8);
        this.d.setChecked(Boolean.valueOf(str3).booleanValue());
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.g.a(this.e, this.f, String.valueOf(z));
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.g.a(this.e, this.f, this.a.getText().toString());
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.text_value);
        this.d = (Switch) findViewById(R.id.switch_button);
        setOnClickListener(this);
        this.d.setOnCheckedChangeListener(this);
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
        if (clipboardManager != null) {
            StringBuilder sb = new StringBuilder(this.b.getText());
            sb.append(":");
            if (this.f.equals("bool")) {
                sb.append(this.d.isChecked());
            } else {
                sb.append(this.c.getText());
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("P/H flag", sb.toString()));
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if ("bool".equals(this.f)) {
            return;
        }
        Context context = getContext();
        EditText editText = new EditText(context);
        this.a = editText;
        editText.setText(this.c.getText());
        this.a.setFocusable(true);
        if ("int".equals(this.f)) {
            this.a.setInputType(3);
        } else {
            this.a.setInputType(524288);
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(this.e).setView(this.a).setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        create.setOnShowListener(new klv((LinearLayout) this, context, 3));
        create.show();
    }
}
