package com.google.android.apps.messaging.diagnostics.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.alog;
import defpackage.klx;
import defpackage.knj;
import defpackage.kov;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsScenarioView extends LinearLayout {
    public TextView a;
    public CheckBox b;
    public final Context c;
    public knj d;
    private TextView e;

    public DiagnosticsScenarioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
    }

    public final void a() {
        String string;
        String str;
        int i = this.d.d;
        int i2 = i - 1;
        Context context = getContext();
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i != 4) {
                                                str = "FAILED";
                                            } else {
                                                str = "WARNING";
                                            }
                                        } else {
                                            str = "SUCCEEDED";
                                        }
                                    } else {
                                        str = "RUNNING";
                                    }
                                } else {
                                    str = "PENDING";
                                }
                                string = a.bW(str, "Unknown status (", ")");
                            } else {
                                string = context.getString(R.string.diagnostics_scenario_status_failed);
                            }
                        } else {
                            string = context.getString(R.string.diagnostics_scenario_status_warning);
                        }
                    } else {
                        string = context.getString(R.string.diagnostics_scenario_status_succeeded);
                    }
                } else {
                    string = context.getString(R.string.diagnostics_scenario_status_running);
                }
            } else {
                string = context.getString(R.string.diagnostics_scenario_status_pending);
            }
            String str2 = string;
            StringBuilder sb = new StringBuilder(str2);
            alog alogVar = this.d.b;
            if (!alogVar.isEmpty()) {
                Context context2 = getContext();
                sb.append(context2.getString(R.string.scenario_status_details_separator));
                sb.append(context2.getString(R.string.diagnostics_scenario_tap_to_learn_more_text));
                setOnClickListener(new kov(this, context2, str2, alogVar, 0));
            }
            this.e.setText(sb);
            return;
        }
        throw null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        this.a = (TextView) findViewById(R.id.diagnostics_scenario_name);
        this.e = (TextView) findViewById(R.id.diagnostics_scenario_status);
        CheckBox checkBox = (CheckBox) findViewById(R.id.enable_scenario_checkbox);
        this.b = checkBox;
        checkBox.setOnClickListener(new klx(this, 7));
        super.onFinishInflate();
    }
}
