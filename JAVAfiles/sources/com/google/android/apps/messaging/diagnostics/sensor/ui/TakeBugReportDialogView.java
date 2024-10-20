package com.google.android.apps.messaging.diagnostics.sensor.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.sensor.ui.TakeBugReportDialogView;
import defpackage.aktp;
import defpackage.aohs;
import defpackage.iew;
import defpackage.klx;
import defpackage.knc;
import defpackage.kok;
import defpackage.kom;
import defpackage.kop;
import defpackage.ks;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TakeBugReportDialogView extends kom {
    public EditText a;
    public RadioGroup b;
    public knc c;
    public Button d;
    public iew e;
    public aohs f;
    private List g;
    private Button h;

    public TakeBugReportDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void c(View view, int i) {
        aktp.L(new kok(new kop(i, this.c, this.a.getText().toString())), view);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List, java.lang.Object] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (EditText) findViewById(R.id.take_bug_report_comment);
        this.b = (RadioGroup) findViewById(R.id.take_bug_report_categories_view);
        this.d = (Button) findViewById(R.id.take_bug_report_view_report_button);
        this.h = (Button) findViewById(R.id.take_bug_report_view_cancel_button);
        this.f.r(this.d, new klx(this, 2));
        this.f.r(this.h, new klx(this, 3));
        ?? r0 = this.e.a;
        this.g = r0;
        for (final knc kncVar : r0) {
            ks ksVar = new ks(getContext());
            ksVar.setText(kncVar.a);
            ksVar.setId(kncVar.c);
            ksVar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kou
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        knc kncVar2 = kncVar;
                        TakeBugReportDialogView takeBugReportDialogView = TakeBugReportDialogView.this;
                        takeBugReportDialogView.c = kncVar2;
                        for (int i = 0; i < takeBugReportDialogView.b.getChildCount(); i++) {
                            ks ksVar2 = (ks) takeBugReportDialogView.b.getChildAt(i);
                            if (kncVar2.c != ksVar2.getId()) {
                                ksVar2.setVisibility(8);
                            }
                        }
                        takeBugReportDialogView.d.setEnabled(true);
                        takeBugReportDialogView.a.requestFocus();
                    }
                }
            });
            this.b.addView(ksVar);
        }
    }
}
