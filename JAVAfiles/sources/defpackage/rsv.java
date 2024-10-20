package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rsv {
    public static final xze a = xze.g("BugleAction", "DraftMessageUtils");
    public final armf b;
    public final armf c;
    public final armf d;
    public final anen e;
    public final qsa f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final psw m;
    private final zxy n;

    public rsv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, zxy zxyVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, psw pswVar, qsa qsaVar, anen anenVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.n = zxyVar;
        this.i = armfVar5;
        this.d = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
        this.l = armfVar9;
        this.m = pswVar;
        this.f = qsaVar;
        this.e = anenVar;
    }

    @Deprecated
    public final int a(ConversationIdType conversationIdType, alog alogVar, String str, String str2, List list, int i, boolean z, boolean z2) {
        String str3;
        xyl.h();
        rto m = ((uie) this.c.b()).m(conversationIdType);
        if (m == null) {
            xyl.c("Trying to determine message protocol type for a non-existent conversation");
            return -1;
        }
        int G = m.G();
        int d = m.d();
        if (G == 2) {
            a.l("msg Rcs because in Rcs group.");
            return 3;
        }
        if (z2) {
            a.l("msg Rcs because it's with bot recipient(s).");
            return 3;
        }
        if (z) {
            a.l("msg Mms because told to explicitly.");
            return 1;
        }
        if (!TextUtils.isEmpty(str)) {
            a.l("msg Mms because has subject.");
            return 1;
        }
        if (((rtz) this.b.b()).aa(conversationIdType)) {
            a.l("msg Mms because receiver is email.");
            return 1;
        }
        if (G == 1) {
            if (!((xbi) this.d.b()).d(i)) {
                a.l("msg Sms because group Mms is disabled.");
                return 0;
            }
            a.l("msg Mms because in Mms group.");
            return 1;
        }
        if (d == 1) {
            return b(str2, i, list, "conversation forced to xMS");
        }
        if (d != 2) {
            msh mshVar = (msh) alogVar.get(0);
            boolean d2 = d(i);
            if (d2) {
                Optional.empty();
                try {
                    Optional g = ((psz) this.j.b()).g(mshVar);
                    if (g.isEmpty()) {
                        a.l("Capability lookup did not find capabilities for the recipient.");
                    } else if (!((psv) g.get()).f()) {
                        a.l("Capability lookup found capabilities that do not support RCS.");
                    } else {
                        xze xzeVar = a;
                        xzeVar.l("Capability lookup found capabilities with RCS support.");
                        xzeVar.l("msg Rcs: both sender/receiver ready for rcs.");
                        return 3;
                    }
                } catch (psx e) {
                    a.r("Capability lookup error for the recipient.", e);
                }
            }
            if (true != d2) {
                str3 = "sender not ready for rcs";
            } else {
                str3 = "receiver not ready for rcs";
            }
            return b(str2, i, list, str3);
        }
        return b(str2, i, list, "conversation latched to xMS");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.String r4, int r5, java.util.List r6, java.lang.String r7) {
        /*
            r3 = this;
            armf r0 = r3.h
            java.lang.Object r0 = r0.b()
            ahmv r0 = (defpackage.ahmv) r0
            if (r4 == 0) goto Ld
            r0.l(r5, r4)
        Ld:
            uuf r4 = defpackage.vof.a
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            r1 = 1
            if (r4 == 0) goto L30
            if (r6 == 0) goto L4c
            j$.util.stream.Stream r4 = j$.util.Collection.EL.stream(r6)
            rsi r6 = new rsi
            r2 = 4
            r6.<init>(r2)
            boolean r4 = r4.noneMatch(r6)
            if (r4 == 0) goto L52
            goto L4c
        L30:
            if (r6 == 0) goto L4c
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L4c
            int r4 = r6.size()
            if (r4 <= r1) goto L3f
            goto L52
        L3f:
            java.lang.Object r4 = r6.get(r5)
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r4 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r4
            boolean r4 = r4.bw()
            if (r4 != 0) goto L4c
            goto L52
        L4c:
            boolean r4 = r0.m()
            if (r4 == 0) goto L54
        L52:
            r4 = r1
            goto L55
        L54:
            r4 = r5
        L55:
            xze r6 = defpackage.rsv.a
            xyo r6 = r6.a()
            java.lang.String r0 = "msg"
            r6.H(r0)
            if (r1 == r4) goto L65
            java.lang.String r0 = "Sms"
            goto L67
        L65:
            java.lang.String r0 = "Mms"
        L67:
            r6.H(r0)
            java.lang.String r0 = "because"
            r6.H(r0)
            r6.H(r7)
            r6.q()
            if (r4 == 0) goto L78
            return r1
        L78:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsv.b(java.lang.String, int, java.util.List, java.lang.String):int");
    }

    public final akul c(final ConversationIdType conversationIdType, final alog alogVar, final String str, final String str2, final List list, final int i, final boolean z, final boolean z2) {
        if (this.m.a()) {
            return aktp.aj(new ancr() { // from class: rst
                @Override // defpackage.ancr
                public final ListenableFuture a() {
                    rsv rsvVar = rsv.this;
                    uie uieVar = (uie) rsvVar.c.b();
                    ConversationIdType conversationIdType2 = conversationIdType;
                    rto m = uieVar.m(conversationIdType2);
                    if (m == null) {
                        xyl.c("Trying to determine message protocol type for a non-existent conversation");
                        return aktp.ag(-1);
                    }
                    int G = m.G();
                    int d = m.d();
                    if (G == 2) {
                        rsv.a.l("msg Rcs because in Rcs group.");
                        return aktp.ag(3);
                    }
                    if (z2) {
                        rsv.a.l("msg Rcs because it's with bot recipient(s).");
                        return aktp.ag(3);
                    }
                    if (z) {
                        rsv.a.l("msg Mms because told explicitly.");
                        return aktp.ag(1);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        rsv.a.l("msg Mms because has subject.");
                        return aktp.ag(1);
                    }
                    if (((rtz) rsvVar.b.b()).aa(conversationIdType2)) {
                        rsv.a.l("msg Mms because receiver is email.");
                        return aktp.ag(1);
                    }
                    int i2 = i;
                    if (G == 1) {
                        if (!((xbi) rsvVar.d.b()).d(i2)) {
                            rsv.a.l("msg Sms because group Mms is disabled.");
                            return aktp.ag(0);
                        }
                        rsv.a.l("msg Mms because in Mms group.");
                        return aktp.ag(1);
                    }
                    List list2 = list;
                    String str3 = str2;
                    if (d == 1) {
                        return aktp.ag(Integer.valueOf(rsvVar.b(str3, i2, list2, "conversation forced to xMS")));
                    }
                    if (d == 2) {
                        return aktp.ag(Integer.valueOf(rsvVar.b(str3, i2, list2, "conversation latched to xMS")));
                    }
                    msh mshVar = (msh) alogVar.get(0);
                    if (!rsvVar.d(i2)) {
                        return aktp.ag(Integer.valueOf(rsvVar.b(str3, i2, list2, "Sender not RCS available")));
                    }
                    return rsvVar.f.b(mshVar).h(new lsx(rsvVar, str3, i2, list2, 5), rsvVar.e);
                }
            }, this.e);
        }
        return aktp.ai(new Callable() { // from class: rsu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(rsv.this.a(conversationIdType, alogVar, str, str2, list, i, z, z2));
            }
        }, this.e);
    }

    public final boolean d(int i) {
        boolean z = true;
        if (i > 0) {
            ((mbl) this.l.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 4);
        } else if (i == 0) {
            ((mbl) this.l.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 3);
        } else if (i == -1) {
            ((mbl) this.l.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 2);
        } else {
            ((mbl) this.l.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 1);
        }
        if (((vrn) ((xyt) this.g.b()).a()).f(i) != amwt.AVAILABLE) {
            z = false;
        }
        if (z != ((adjc) this.k.b()).w(i)) {
            ((mbl) this.l.b()).e("Bugle.Dsdr.ProvisioningApiDiff", ((adjc) this.k.b()).d(i).a.E);
        }
        return ((adjc) this.k.b()).w(i);
    }

    public final boolean e(Context context, int i) {
        try {
            if (this.n.x(i).q(context.getString(R.string.stop_asking_sim_number_pref_key), false)) {
                return false;
            }
            return ((yjy) this.i.b()).h(i).l(true).isEmpty();
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
