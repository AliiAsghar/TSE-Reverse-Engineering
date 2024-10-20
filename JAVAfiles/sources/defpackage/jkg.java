package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkg implements agck {
    public final jkk a;
    public final agck b;
    public final adwo c;
    private final Context d;
    private final armf e;
    private final jxv f;

    public jkg(jkk jkkVar, qdq qdqVar, jxv jxvVar, Context context, armf armfVar, adwo adwoVar, amqe amqeVar) {
        jkkVar.getClass();
        qdqVar.getClass();
        jxvVar.getClass();
        context.getClass();
        armfVar.getClass();
        adwoVar.getClass();
        amqeVar.getClass();
        this.a = jkkVar;
        this.f = jxvVar;
        this.d = context;
        this.e = armfVar;
        this.c = adwoVar;
        amqh amqhVar = amqh.CAMERA_GALLERY;
        jbs jbsVar = jbs.m;
        krv krvVar = ((ksb) qdqVar.a).a;
        this.b = new jko(krvVar.a.cs, (xnv) krvVar.bV.b(), (jxv) ((ksb) qdqVar.a).c.g.b(), amqhVar, amqeVar, jbsVar);
    }

    public static final float d(agce agceVar, bwj bwjVar) {
        float f;
        bwjVar.y(2018824436);
        dqv dqvVar = (dqv) bwjVar.g(dch.d);
        dqv dqvVar2 = (dqv) bwjVar.g(dch.d);
        bwjVar.y(-1567425557);
        cas a = cap.a(new dqy(new alt(anl.f(bwjVar), dqvVar2).d()), bwjVar);
        bwjVar.q();
        float eh = dqvVar.eh(dqs.a(agceVar.a())) - (dqvVar.eh(dqs.b(agceVar.a())) / 0.75f);
        f = ((dqy) a.a()).a;
        float f2 = ((dqy) arrn.y(new dqy(((eh - 50.0f) - 10.0f) - f), new dqy(48.0f))).a;
        bwjVar.q();
        return f2;
    }

    public static final boolean e(jkl jklVar, bwj bwjVar) {
        bwjVar.y(634088478);
        cas a = cak.a(jklVar.c, bwjVar);
        boolean z = false;
        if (!hld.s(jklVar, bwjVar) && !a.x(a).isEmpty()) {
            z = true;
        }
        bwjVar.q();
        return z;
    }

    public static final boolean f(jkl jklVar, bwj bwjVar) {
        boolean z;
        bwjVar.y(479063330);
        if (!a.x(cak.a(jklVar.c, bwjVar)).isEmpty()) {
            hld.t(bwjVar);
            z = true;
        } else {
            z = false;
        }
        bwjVar.q();
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aflb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ascv, java.lang.Object] */
    @Override // defpackage.agck
    public final void a() {
        jkk jkkVar = this.a;
        if (((ove) jkkVar.d.b()).a()) {
            jkkVar.c.d();
        }
        mgu mguVar = jkkVar.b.e;
        String str = ((jhc) ((jxv) mguVar.b).a.c()).a;
        if (str == null) {
            str = "";
        }
        mguVar.e.h(str);
        this.b.a();
    }

    public final void b() {
        lre lreVar = (lre) this.e.b();
        String string = this.d.getString(R.string.contains_attachments_error_message);
        string.getClass();
        String string2 = this.d.getString(R.string.contains_attachments_confirm);
        string2.getClass();
        lreVar.d(new aepx(string, null, null, null, false, false, new aewr(string2, ipf.u), null, null, 446), true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ascv, java.lang.Object] */
    public final boolean c() {
        return hld.x((jhc) this.f.a.c());
    }
}
