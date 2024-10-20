package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abym {
    public Bitmap a;
    public String b;
    public String c;
    public String d;
    public ThemeSettings e;
    public LogOptions f;
    public String g;
    ApplicationErrorReport h;
    private final Bundle i;
    private final List j;
    private boolean k;
    private String l;
    private abmr m;

    @Deprecated
    public abym() {
        this.i = new Bundle();
        this.j = new ArrayList();
        this.h = new ApplicationErrorReport();
        this.l = abmr.p();
    }

    public FeedbackOptions a() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.m = this.a;
        feedbackOptions.f = null;
        feedbackOptions.a = this.b;
        feedbackOptions.c = this.c;
        feedbackOptions.b = this.i;
        feedbackOptions.e = this.d;
        feedbackOptions.h = this.j;
        feedbackOptions.i = false;
        feedbackOptions.j = this.e;
        feedbackOptions.k = this.f;
        feedbackOptions.l = this.k;
        feedbackOptions.t = this.m;
        feedbackOptions.n = this.l;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        feedbackOptions.q = false;
        feedbackOptions.r = this.g;
        feedbackOptions.s = null;
        return feedbackOptions;
    }

    final void b(boolean z) {
        if ((this.i.isEmpty() && this.j.isEmpty()) || this.k == z) {
            this.k = z;
            return;
        }
        throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
    }

    public final void c(String str) {
        b(false);
        this.i.putString("Exception", str);
    }

    public final void d(abmr abmrVar, boolean z) {
        b(z);
        this.m = abmrVar;
    }

    public abym(Context context) {
        String p;
        acmn.b(context);
        this.i = new Bundle();
        this.j = new ArrayList();
        this.h = new ApplicationErrorReport();
        try {
            if (((Boolean) abyu.a.a()).booleanValue()) {
                p = System.currentTimeMillis() + "_" + Math.abs(new SecureRandom().nextLong());
            } else {
                p = abmr.p();
            }
            this.l = p;
        } catch (SecurityException unused) {
            this.l = abmr.p();
        }
    }
}
