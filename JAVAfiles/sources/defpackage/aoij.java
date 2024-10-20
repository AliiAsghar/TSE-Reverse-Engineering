package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aoij {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aoij(adrc adrcVar, String str, acnb acnbVar) {
        this.c = adrcVar;
        this.b = str;
        this.a = acnbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [agnw, java.lang.Object] */
    public final void a(boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            ?? r3 = this.c;
            if (i2 < ((alsx) r3).c) {
                alog alogVar = (alog) r3.get(i2);
                int size = alogVar.size();
                int i3 = 0;
                while (true) {
                    i = i2 + 1;
                    if (i3 < size) {
                        agou agouVar = (agou) alogVar.get(i3);
                        if (z) {
                            Object obj = this.b;
                            ?? r8 = this.a;
                            agoz agozVar = agouVar.a;
                            List list = agouVar.d;
                            agmc agmcVar = agouVar.b;
                            agoz.x(new agor(agmcVar, agozVar, (aglo) obj, DesugarCollections.unmodifiableList(list), 0));
                            alvg alvgVar = (alvg) agoz.c.a(agoz.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPost", 974, "QueryBase.java");
                            agpf agpfVar = agozVar.e;
                            alvgVar.J("onChangeInTransactionWithObject: table: %s; loggingTag: %s; listener: %s", agoz.R(agpfVar.a), String.valueOf(agpfVar.r), agmcVar.getClass().getName());
                            String valueOf = String.valueOf(agmcVar.d);
                            r8.D(valueOf, new aefw(agmcVar, 19));
                            r8.D(valueOf, new adhc(agozVar, agmcVar, 14));
                        } else {
                            agouVar.d.set(agouVar.c, null);
                        }
                        i3++;
                    }
                }
                i2 = i;
            } else {
                return;
            }
        }
    }

    public final void b(String str, int i) {
        String str2;
        int i2;
        if (((Boolean) ((utz) yfd.b.get()).e()).booleanValue()) {
            maq maqVar = (maq) ((yfd) this.a).c.b();
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            aozy createBuilder = amlb.a.createBuilder();
            aozy createBuilder2 = amkx.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            amkx amkxVar = (amkx) apagVar;
            str.getClass();
            amkxVar.b |= 1;
            amkxVar.c = str;
            int i3 = i - 1;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        i2 = 7;
                    } else {
                        i2 = 6;
                    }
                } else {
                    i2 = 5;
                }
            } else {
                i2 = 4;
            }
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            amkx amkxVar2 = (amkx) createBuilder2.b;
            amkxVar2.d = i2 - 1;
            amkxVar2.b |= 2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amlb amlbVar = (amlb) createBuilder.b;
            amkx amkxVar3 = (amkx) createBuilder2.s();
            amkxVar3.getClass();
            amlbVar.d = amkxVar3;
            amlbVar.b |= 2;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amlb amlbVar2 = (amlb) createBuilder.s();
            amlbVar2.getClass();
            amfrVar.aE = amlbVar2;
            amfrVar.e |= 262144;
            amfp amfpVar = amfp.BUGLE_HATS_NEXT_CLIENT_EVENT;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amfrVar2.i = amfpVar.dg;
            amfrVar2.b |= 1;
            maqVar.j(amfqVar);
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    str2 = "UNSUPPORTED_CRONET_ENGINE";
                } else {
                    str2 = "TRIGGER_ID_NOT_SET";
                }
            } else {
                str2 = "NO_AVAILABLE_SURVEY";
            }
        } else {
            str2 = "FAILED_TO_FETCH_SURVEY";
        }
        yfd.a.m(String.format("Failed to fetch survey (trigger id: %s, error: %s.)", str, str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0330, code lost:
    
        if (r0 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x053b, code lost:
    
        if (r5 != 3) goto L203;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [yet, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.aizc r28) {
        /*
            Method dump skipped, instructions count: 1813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoij.c(aizc):void");
    }

    public aoij(aiyx aiyxVar, akkw akkwVar, aizi aiziVar) {
        this.c = akkwVar;
        this.a = aiziVar;
        this.b = aiyxVar;
    }

    public /* synthetic */ aoij(FirebaseMessaging firebaseMessaging, String str, aoit aoitVar) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = aoitVar;
    }

    public aoij(Object obj, Object obj2, Object obj3) {
        this.b = obj2;
        this.c = obj3;
        this.a = obj;
    }

    public /* synthetic */ aoij(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public aoij(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
