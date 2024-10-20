package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mke implements ancx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mke(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, ancx] */
    /* JADX WARN: Type inference failed for: r3v6, types: [armf, java.lang.Object] */
    @Override // defpackage.ancx
    public final Object a(ahmn ahmnVar) {
        ych c;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ?? r0 = this.a;
                    long j = akto.a;
                    ahmnVar.getClass();
                    akry h = akqj.h(akqj.b(), r0);
                    try {
                        return this.b.a(ahmnVar);
                    } finally {
                    }
                } else {
                    Object obj = this.b;
                    MediaPlayer a = ygu.a();
                    yyt yytVar = (yyt) obj;
                    wpp wppVar = (wpp) yytVar.c;
                    Context context = (Context) wppVar.a.b();
                    context.getClass();
                    anen anenVar = (anen) wppVar.c.b();
                    anenVar.getClass();
                    AudioManager audioManager = (AudioManager) wppVar.b.b();
                    audioManager.getClass();
                    ygs ygsVar = new ygs(context, anenVar, audioManager, a, (ygf) this.a);
                    ahmnVar.x(ygsVar, yytVar.a);
                    return ygsVar;
                }
            } else {
                mkg mkgVar = (mkg) this.a;
                qnu qnuVar = (qnu) mkgVar.e.b();
                String str = (String) this.b;
                if (qnu.b(str)) {
                    c = qnu.c(qnuVar, ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, str, ycg.a);
                } else {
                    c = qnu.c(qnuVar, ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, str, ycg.a);
                }
                ahmnVar.x(c, mkgVar.a);
                return c;
            }
        } else {
            mkg mkgVar2 = (mkg) this.a;
            qnu qnuVar2 = (qnu) mkgVar2.e.b();
            ycf ycfVar = new ycf();
            ycfVar.b(1000000000L);
            ych a2 = qnuVar2.a((String) this.b, ycfVar.a());
            ahmnVar.x(a2, mkgVar2.a);
            return a2;
        }
    }

    public /* synthetic */ mke(yyt yytVar, ygf ygfVar, int i) {
        this.c = i;
        this.b = yytVar;
        this.a = ygfVar;
    }
}
