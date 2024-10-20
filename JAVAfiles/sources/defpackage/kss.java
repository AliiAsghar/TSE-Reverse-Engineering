package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kss implements ksq {
    public final armf a;
    public final ryg b;
    public List c = new ArrayList();
    public List d = new ArrayList();
    public final yzk e;
    public final qya f;
    public final vid g;
    public final ibi h;
    private final Context i;
    private final anen j;

    public kss(Context context, anen anenVar, armf armfVar, vid vidVar, qya qyaVar, yzk yzkVar, ryg rygVar, ibi ibiVar) {
        this.i = context;
        this.j = anenVar;
        this.a = armfVar;
        this.g = vidVar;
        this.f = qyaVar;
        this.e = yzkVar;
        this.b = rygVar;
        this.h = ibiVar;
    }

    @Override // defpackage.ksq
    public final akul a() {
        return aktp.ag(new HashMap());
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final akul c() {
        return aktp.ai(new gvk(this, 19), this.j);
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul d() {
        return uvl.d();
    }

    @Override // defpackage.ksq
    public final ameg e() {
        return ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_PROBLEMATIC_MESSAGES_ADVANCED_INFO;
    }

    @Override // defpackage.ksq
    public final String f() {
        return this.i.getString(R.string.problematic_message_feedback_data_description);
    }

    @Override // defpackage.ksq
    public final String g() {
        return this.i.getString(R.string.problematic_message_feedback_data_detail_title);
    }

    @Override // defpackage.ksq
    public final String h() {
        return this.i.getString(R.string.problematic_message_feedback_data_name);
    }

    @Override // defpackage.ksq
    public final String i() {
        return this.i.getString(R.string.problematic_message_feedback_data_rationale);
    }

    @Override // defpackage.ksq
    public final String j() {
        return this.i.getString(R.string.problematic_message_feedback_data_rationale_title);
    }
}
