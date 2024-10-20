package defpackage;

import android.view.View;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ijm implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ijm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v62, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, ncq] */
    @Override // java.util.function.Supplier
    public final Object get() {
        Object obj;
        switch (this.b) {
            case 0:
                amqm amqmVar = (amqm) amqn.a.createBuilder();
                amqmVar.getClass();
                ahlp ahlpVar = new ahlp(amqmVar);
                this.a.a(ahlpVar);
                apag s = ((aozy) ahlpVar.a).s();
                s.getClass();
                return (amqn) s;
            case 1:
                alhr alhrVar = iil.a;
                amfa amfaVar = (amfa) amfb.a.createBuilder();
                amfaVar.getClass();
                ahlp ahlpVar2 = new ahlp(amfaVar);
                this.a.a(ahlpVar2);
                apag s2 = ((aozy) ahlpVar2.a).s();
                s2.getClass();
                return (amfb) s2;
            case 2:
                inq inqVar = ((inh) this.a).h;
                inqVar.getClass();
                return inqVar;
            case 3:
                Object obj2 = this.a;
                ioy ioyVar = (ioy) obj2;
                Stream map = Collection.EL.stream(ioyVar.c).map(new ijs(obj2, 18));
                int i = alog.d;
                alog alogVar = (alog) map.collect(alls.a);
                ioyVar.c = alsx.a;
                return alogVar;
            case 4:
                obj = ((ipc) this.a).h.get();
                return ((inq) obj).e();
            case 5:
                return this.a;
            case 6:
                ArrayList arrayList = new ArrayList(1);
                kvw kvwVar = (kvw) this.a;
                aabr aabrVar = new aabr(kvwVar.f(kvwVar.b));
                if (kvwVar.T.a() != null) {
                    View a = kvwVar.T.a();
                    a.getClass();
                    arrayList.add(new aabr(a));
                }
                arrayList.add(aabrVar);
                return arrayList;
            case 7:
                amwc amwcVar = (amwc) amwg.a.createBuilder();
                amwcVar.getClass();
                ahlp ahlpVar3 = new ahlp(amwcVar);
                this.a.a(ahlpVar3);
                apag s3 = ((aozy) ahlpVar3.a).s();
                s3.getClass();
                return (amwg) s3;
            case 8:
                return mci.h(5, (amoq) this.a, -1, -1);
            case 9:
                aozy createBuilder = ampx.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj3 = this.a;
                ampx ampxVar = (ampx) createBuilder.b;
                obj3.getClass();
                ampxVar.c = (ampy) obj3;
                ampxVar.b = 1 | ampxVar.b;
                return (ampx) createBuilder.s();
            case 10:
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_TRANSCODING;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b = 1 | amfrVar.b;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                Object obj4 = this.a;
                amfr amfrVar2 = (amfr) amfqVar.b;
                obj4.getClass();
                amfrVar2.q = (amnl) obj4;
                amfrVar2.b |= 512;
                return amfqVar;
            case 11:
                alvw i2 = mmw.c.i();
                i2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "isRcsConversationAsync", 686, "BugleLegacyConversationCreator.java")).q("Could not get subscription for selfId, using default one.");
                return Integer.valueOf(((mmw) this.a).j.d().e());
            case 12:
                return (String) this.a.get();
            case 13:
                return (String) this.a.get();
            case 14:
                return this.a;
            case 15:
                return this.a.b();
            case 16:
                return Boolean.valueOf(((ansy) ((nlr) ((ngr) this.a).s).a.b()).e("bugle.use_custom_cursor_factory2"));
            case 17:
                return Boolean.valueOf(((ansy) ((nlm) ((ngr) this.a).u).a.b()).e("bugle.enable_db_overrides"));
            case 18:
                return (Executor) ((ngr) this.a).k.b();
            case 19:
                return (Executor) ((ngr) this.a).l.b();
            default:
                return (Executor) ((ngr) this.a).m.b();
        }
    }
}
