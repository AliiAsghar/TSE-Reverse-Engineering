package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class irk implements Callable {
    public final /* synthetic */ akul a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ irk(irl irlVar, akul akulVar, akul akulVar2, akul akulVar3, rry rryVar, BiPredicate biPredicate, int i) {
        this.g = i;
        this.b = irlVar;
        this.c = akulVar;
        this.a = akulVar2;
        this.d = akulVar3;
        this.e = rryVar;
        this.f = biPredicate;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v14, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.function.BiPredicate, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.function.BiPredicate, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean test;
        boolean test2;
        String ag;
        int i = this.g;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    apwl apwlVar = (apwl) apag.parseFrom(apwl.a, (aozb) this.f, aozs.a());
                    ?? r1 = this.b;
                    Optional ac = r1.ac();
                    albo.y(ac.isPresent());
                    if (((Boolean) new mss(6).get()).booleanValue()) {
                        ag = (String) ac.get().e().map(new tgn(19)).orElse(albo.ag(ac.get().m()));
                    } else {
                        ag = albo.ag(ac.get().g());
                    }
                    ?? r4 = this.d;
                    Object obj = this.e;
                    akul akulVar = this.a;
                    Object obj2 = this.c;
                    qei w = r1.w();
                    String str = (String) albo.bQ(akulVar);
                    ttl ttlVar = (ttl) obj2;
                    qei a = ((psq) ttlVar.g.b()).a(ag, false);
                    long q = r1.q();
                    long n = r1.n();
                    NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) albo.bQ(r4);
                    vqx a2 = vqy.a();
                    a2.h((rve) obj);
                    a2.l(ag);
                    a2.j(n);
                    a2.k(a);
                    a2.m(w);
                    a2.e(false);
                    a2.n(q);
                    a2.i(0L);
                    a2.o(0);
                    a2.f(false);
                    a2.c(false);
                    a2.d(false);
                    return ttlVar.h.a(str, apwlVar, a2.a(), nativeMessageEncryptorV2);
                }
                ((qrb) this.b).e((qqz) albo.bQ(this.e), (qqz) albo.bQ(this.c), (qqz) albo.bQ(this.a), (alog) this.d, (amra) this.f);
                return null;
            }
            ParticipantsTable.BindData a3 = ((rsa) albo.bQ(this.c)).a();
            Boolean bool = (Boolean) albo.bQ(this.a);
            bool.booleanValue();
            Optional optional = (Optional) albo.bQ(this.d);
            if (optional.isPresent()) {
                Object obj3 = this.b;
                sac sacVar = (sac) optional.get();
                irl irlVar = (irl) obj3;
                if (!irlVar.d.m() || sacVar.g() == 0) {
                    z = false;
                }
                ?? r3 = this.f;
                Object obj4 = this.e;
                String a4 = irlVar.a(a3);
                test2 = r3.test(obj4, bool);
                return irl.b((rry) obj4, a4, test2, z);
            }
            throw new IllegalStateException("Unable to fetch conversation metadata.");
        }
        ParticipantsTable.BindData a5 = ((rsa) albo.bQ(this.c)).a();
        Boolean bool2 = (Boolean) albo.bQ(this.a);
        bool2.booleanValue();
        Optional optional2 = (Optional) albo.bQ(this.d);
        if (optional2.isPresent()) {
            Object obj5 = this.b;
            san sanVar = (san) optional2.get();
            irl irlVar2 = (irl) obj5;
            if (!irlVar2.d.m() || sanVar.g() == 0) {
                z = false;
            }
            ?? r32 = this.f;
            Object obj6 = this.e;
            String a6 = irlVar2.a(a5);
            test = r32.test(obj6, bool2);
            return irl.b((rry) obj6, a6, test, z);
        }
        throw new IllegalStateException("Unable to fetch conversation metadata.");
    }

    public /* synthetic */ irk(qrb qrbVar, akul akulVar, akul akulVar2, akul akulVar3, alog alogVar, amra amraVar, int i) {
        this.g = i;
        this.b = qrbVar;
        this.e = akulVar;
        this.c = akulVar2;
        this.a = akulVar3;
        this.d = alogVar;
        this.f = amraVar;
    }

    public /* synthetic */ irk(ttl ttlVar, aozb aozbVar, MessageCoreData messageCoreData, akul akulVar, rve rveVar, akul akulVar2, int i) {
        this.g = i;
        this.c = ttlVar;
        this.f = aozbVar;
        this.b = messageCoreData;
        this.a = akulVar;
        this.e = rveVar;
        this.d = akulVar2;
    }
}
