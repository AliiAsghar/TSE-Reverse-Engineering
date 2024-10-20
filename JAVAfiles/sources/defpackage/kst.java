package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kst implements ksq {
    public final ryg a;
    private final anen b;
    private final Context c;

    public kst(Context context, ryg rygVar, anen anenVar) {
        this.c = context;
        this.a = rygVar;
        this.b = anenVar;
    }

    private final akul k() {
        return aktp.ai(new gvk(this, 20), this.b);
    }

    @Override // defpackage.ksq
    public final akul a() {
        return k().h(new its(13), this.b);
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul c() {
        return uvl.c();
    }

    @Override // defpackage.uvn
    public final akul d() {
        return k();
    }

    @Override // defpackage.ksq
    public final ameg e() {
        return ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_SELF_PHONE_NUMBER;
    }

    @Override // defpackage.ksq
    public final String f() {
        return this.c.getString(R.string.self_phone_number_feedback_data_description);
    }

    @Override // defpackage.ksq
    public final String g() {
        return this.c.getString(R.string.self_phone_number_feedback_data_detail_title);
    }

    @Override // defpackage.ksq
    public final String h() {
        return this.c.getString(R.string.self_phone_number_feedback_data_name);
    }

    @Override // defpackage.ksq
    public final String i() {
        return this.c.getString(R.string.self_phone_number_feedback_data_rationale);
    }

    @Override // defpackage.ksq
    public final String j() {
        return this.c.getString(R.string.self_phone_number_feedback_data_rationale_title);
    }
}
