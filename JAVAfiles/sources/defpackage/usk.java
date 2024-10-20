package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ExpireWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Map;
import j$.util.Optional;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usk {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public usk(aiwu aiwuVar, anen anenVar, anen anenVar2, ansy ansyVar, ahiy ahiyVar, trz trzVar) {
        this.b = aiwuVar;
        this.d = anenVar;
        this.f = anenVar2;
        this.c = ansyVar;
        this.e = ahiyVar;
        this.a = trzVar;
    }

    public static boolean i(char c) {
        if (Character.isISOControl(c)) {
            return true;
        }
        if (Character.isLetterOrDigit(c)) {
            return false;
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        if ((of != null && of.equals(Character.UnicodeBlock.SPECIALS)) || Character.getType(c) == 16) {
            return true;
        }
        return false;
    }

    private final char m() {
        if (((LinkedList) this.f).isEmpty()) {
            return '?';
        }
        try {
            Character ch = (Character) ((LinkedList) this.f).removeFirst();
            if (ch == null) {
                return '?';
            }
            return ch.charValue();
        } catch (NoSuchElementException unused) {
            return '?';
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, ascd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arqr r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.usi
            if (r0 == 0) goto L13
            r0 = r8
            usi r0 = (defpackage.usi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            usi r0 = new usi
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            usk r7 = r0.d
            defpackage.aqil.P(r8)     // Catch: java.lang.Exception -> L2a
            goto L63
        L2a:
            r8 = move-exception
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.aqil.P(r8)
            java.lang.Object r8 = r6.f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            boolean r8 = r8.g(r2, r5)
            if (r8 == 0) goto L63
            r0.d = r6     // Catch: java.lang.Exception -> L52
            r0.c = r4     // Catch: java.lang.Exception -> L52
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Exception -> L52
            if (r7 != r1) goto L63
            return r1
        L52:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L55:
            java.lang.Object r7 = r7.f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r7.g(r0, r1)
            throw r8
        L63:
            arnb r7 = defpackage.arnb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usk.a(arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(4:(1:(10:10|11|12|13|14|15|(1:25)|18|(1:19)|22)(2:37|38))(4:39|40|41|42)|28|(1:29)|32)(4:54|(2:55|(1:57)(3:68|69|70))|61|(1:63)(1:64))|43|44|(8:46|14|15|(0)|25|18|(1:19)|22)(1:47)))|71|6|(0)(0)|43|44|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0111, code lost:
    
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0114, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0115, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, ascc] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, ascd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r18, long r19, defpackage.arqv r21, defpackage.arpe r22) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usk.b(java.lang.String, long, arqv, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul c() {
        return akul.g(((aiwu) this.b).a()).h(new tvd(20), this.f);
    }

    public final void d(String str) {
        ((ahiy) this.e).q(aktp.ag(null), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul e(tqb tqbVar, ancs ancsVar) {
        return aktp.ai(new qpk(this, tqbVar, 7), this.c).i(new qbt((Object) this, (Object) tqbVar, (Object) ancsVar, 11, (byte[]) null), this.d);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, qpj] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    public final long f() {
        ConversationIdType l;
        long j = -1;
        if (((Boolean) qpf.a.e()).booleanValue()) {
            Optional o = this.c.o("ʼWAP_PUSH_SI!ʼ");
            if (o.isEmpty()) {
                ExpireWapPushSiMessageAction.a.o("no WAP Push SI messages.");
                return -1L;
            }
            l = ((smr) o.get()).x();
        } else {
            long e = ((wyt) this.a.b()).e("ʼWAP_PUSH_SI!ʼ");
            if (e < 0) {
                ExpireWapPushSiMessageAction.a.q("deleteExpiredMessages: can not get thread.");
                return -1L;
            }
            l = ((rtz) this.b.b()).l(e);
            if (l == null) {
                ExpireWapPushSiMessageAction.a.o("no WAP Push SI messages. (null)");
                return -1L;
            }
            if (l.b()) {
                ExpireWapPushSiMessageAction.a.o("no WAP Push SI messages. (empty)");
                return -1L;
            }
        }
        long epochMilli = ((xnv) this.d).f().toEpochMilli();
        long a = xcd.a();
        xyo a2 = ExpireWapPushSiMessageAction.a.a();
        a2.H("time zone offset");
        a2.G(TimeUnit.MILLISECONDS.toHours(a));
        a2.H("hour(s).");
        a2.q();
        sxy d = MessagesTable.d();
        d.w("deleteExpiredMessages");
        d.g(new qwz(l, 11));
        sxt sxtVar = (sxt) d.b().n();
        ArrayList arrayList = null;
        while (true) {
            try {
                if (!sxtVar.moveToNext()) {
                    break;
                }
                long p = sxtVar.p();
                if (p > 0) {
                    long j2 = p + a;
                    if (j2 <= epochMilli) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(sxtVar.E());
                    } else {
                        j = j2;
                        break;
                    }
                }
            } catch (Throwable th) {
                try {
                    sxtVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        sxtVar.close();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                MessageIdType messageIdType = (MessageIdType) arrayList.get(i);
                xyo c = ExpireWapPushSiMessageAction.a.c();
                c.H("delete expired");
                c.c(messageIdType);
                c.q();
                ((rim) this.e).a(((rwd) this.f.b()).u(messageIdType));
            }
        }
        return j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final qra g(qqq qqqVar) {
        anen anenVar = (anen) this.e.b();
        anenVar.getClass();
        return new qra(anenVar, this.d, this.b, this.c, this.a, qqqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [acxs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map, java.lang.Object] */
    public final char h(char c) {
        if (Character.isDigit(c)) {
            if (c >= '0' && c <= '9') {
                return ((Character) ((alog) this.e).get(c - '0')).charValue();
            }
            if (this.c.a()) {
                return ((Character) ((alog) this.b).get(Character.digit(c, 10))).charValue();
            }
            return c;
        }
        if (!Character.isWhitespace(c) && !i(c)) {
            Object obj = this.d;
            Character valueOf = Character.valueOf(c);
            if (!((alpt) obj).contains(valueOf)) {
                if (((HashMap) this.a).containsKey(valueOf)) {
                    return ((Character) Map.EL.getOrDefault(this.a, valueOf, '?')).charValue();
                }
                char m = m();
                ((HashMap) this.a).put(valueOf, Character.valueOf(m));
                return m;
            }
            return c;
        }
        return c;
    }

    public final yga j(qdt qdtVar) {
        return ((yyt) this.e).w(qdtVar, "Subscribe Typing updates", "Typing update callback", "Typing update unregister");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul k() {
        return aktp.ai(new mig(this, 18), this.f);
    }

    public final void l(String str) {
        ((yyt) this.e).y(new ngq(str, 15), "notifyCallbacks");
    }

    public usk(armf armfVar, armf armfVar2, xnv xnvVar, armf armfVar3, rim rimVar, qpj qpjVar) {
        this.f = armfVar;
        this.b = armfVar2;
        this.d = xnvVar;
        this.a = armfVar3;
        this.e = rimVar;
        this.c = qpjVar;
    }

    public usk(aneo aneoVar, ahiy ahiyVar, xnv xnvVar, wfh wfhVar) {
        this.a = new HashMap();
        this.d = aneoVar;
        this.b = ahiyVar;
        this.f = new anew(aneoVar);
        this.c = xnvVar;
        this.e = wfhVar.Y(new qds(0));
    }

    public usk(java.util.Map map, anen anenVar, anen anenVar2, java.util.Map map2) {
        this.f = alor.j(map);
        this.d = anenVar;
        this.a = anenVar2;
        this.b = map2;
        this.c = new anew(anenVar);
        this.e = new vl();
    }

    public usk(uqg uqgVar, xnv xnvVar, armf armfVar) {
        uqgVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        this.a = uqgVar;
        this.b = xnvVar;
        this.c = armfVar;
        this.d = ascy.a(arnw.a);
        this.e = asck.e(0, 0, 0, 7);
        this.f = ascy.a(false);
    }

    public usk(Function function, acxs acxsVar, String str, alpt alptVar) {
        Object apply;
        this.a = new HashMap();
        this.c = acxsVar;
        apply = function.apply(str);
        Random random = (Random) apply;
        ArrayList ap = alzz.ap('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K');
        Collections.shuffle(ap, random);
        this.e = alog.n(ap);
        ArrayList ap2 = alzz.ap('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z');
        Collections.shuffle(ap2, random);
        this.f = new LinkedList(ap2);
        if (acxsVar.a()) {
            ArrayList ap3 = alzz.ap('L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V');
            Collections.shuffle(ap3, random);
            this.b = alog.n(ap3);
        } else {
            this.b = alsx.a;
        }
        this.d = alptVar;
    }

    public usk(char[] cArr, byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "backup_id_map._id";
        a.c = new wsy();
        sfs sfsVar = new sfs(a.a());
        this.b = sfsVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.c(true);
        a2.a = "backup_id_map.table_name";
        a2.e(true);
        a2.c = new wsy();
        sfs sfsVar2 = new sfs(a2.a());
        this.d = sfsVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.a = "backup_id_map.backup_id";
        a3.e(true);
        a3.c = new wsy();
        sfs sfsVar3 = new sfs(a3.a());
        this.e = sfsVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.c(true);
        a4.a = "backup_id_map.bugle_id";
        a4.c = new wsy();
        sfs sfsVar4 = new sfs(a4.a());
        this.f = sfsVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.c(true);
        a5.a = "backup_id_map.status";
        a5.c = new wsy();
        sfs sfsVar5 = new sfs(a5.a());
        this.a = sfsVar5;
        this.c = new sfs[]{sfsVar, sfsVar2, sfsVar3, sfsVar4, sfsVar5};
    }

    public usk(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
    }

    public usk(byte[] bArr, char[] cArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "cms_deleted_messages_buffer._id";
        a.c = new wsy();
        shj shjVar = new shj(a.a());
        this.d = shjVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.i(true);
        a2.c(true);
        a2.a = "cms_deleted_messages_buffer.message_id";
        a2.c = new wsy();
        shj shjVar2 = new shj(a2.a());
        this.a = shjVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.i(true);
        a3.a = "cms_deleted_messages_buffer.conversation_id";
        a3.c = new wsy();
        shj shjVar3 = new shj(a3.a());
        this.c = shjVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.i(true);
        a4.a = "cms_deleted_messages_buffer.message_deletion_reason";
        a4.c = new wsy();
        shj shjVar4 = new shj(a4.a());
        this.f = shjVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.i(true);
        a5.a = "cms_deleted_messages_buffer.deletion_timestamp";
        a5.c = new wsy();
        shj shjVar5 = new shj(a5.a());
        this.e = shjVar5;
        this.b = new shj[]{shjVar, shjVar2, shjVar3, shjVar4, shjVar5};
    }

    public usk(int[] iArr) {
        agmi a = agmk.a();
        a.d = 1;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.a = "subscriptions.sub_id";
        a.c = new wsy();
        qwp qwpVar = new qwp(a.a());
        this.f = qwpVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.i(true);
        a2.f(true);
        a2.c(true);
        a2.a = "subscriptions.sim_serial_number";
        a2.c = new wsy();
        qwp qwpVar2 = new qwp(a2.a());
        this.b = qwpVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "subscriptions.telephony_phone_number";
        a3.c = new wsy();
        qwp qwpVar3 = new qwp(a3.a());
        this.a = qwpVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.c(true);
        a4.a = "subscriptions.my_identity_token";
        a4.c = new wsy();
        qwp qwpVar4 = new qwp(a4.a());
        this.e = qwpVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.c(true);
        a5.d(true);
        a5.b = new qqe(20);
        a5.a = "subscriptions.my_identity_token_with_foreign_key";
        a5.c = new wsy();
        qwp qwpVar5 = new qwp(a5.a());
        this.d = qwpVar5;
        this.c = new qwp[]{qwpVar, qwpVar2, qwpVar3, qwpVar4, qwpVar5};
    }

    public usk(short[] sArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 1;
        a.a = "cms.key_index";
        a.c = new wsy();
        siy siyVar = new siy(a.a());
        this.a = siyVar;
        agmi a2 = agmk.a();
        a2.d = 5;
        a2.a = "cms.encryption_key";
        a2.c = new wsy();
        siy siyVar2 = new siy(a2.a());
        this.f = siyVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "cms.key_type";
        a3.c = new wsy();
        siy siyVar3 = new siy(a3.a());
        this.d = siyVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.j(true);
        a4.c(true);
        a4.a = "cms.cms_correlation_id";
        a4.e(true);
        a4.c = new wsy();
        siy siyVar4 = new siy(a4.a());
        this.c = siyVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.j(true);
        a5.c(true);
        a5.a = "cms.cms_id";
        a5.e(true);
        a5.c = new wsy();
        siy siyVar5 = new siy(a5.a());
        this.e = siyVar5;
        this.b = new siy[]{siyVar, siyVar2, siyVar3, siyVar4, siyVar5};
    }

    public usk(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "flagged_messages._id";
        a.c = new wsy();
        sqh sqhVar = new sqh(a.a());
        this.a = sqhVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new spk(12);
        a2.a = "flagged_messages.flagged_message_id";
        a2.e(true);
        a2.c = new wsy();
        sqh sqhVar2 = new sqh(a2.a());
        this.b = sqhVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.a = "flagged_messages.flagging_reason";
        a3.e(true);
        a3.c = new wsy();
        sqh sqhVar3 = new sqh(a3.a());
        this.f = sqhVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.a = "flagged_messages.flagged_message_timestamp";
        a4.c = new wsy();
        sqh sqhVar4 = new sqh(a4.a());
        this.e = sqhVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "flagged_messages.flagged_message_notified";
        a5.c = new wsy();
        sqh sqhVar5 = new sqh(a5.a());
        this.c = sqhVar5;
        this.d = new sqh[]{sqhVar, sqhVar2, sqhVar3, sqhVar4, sqhVar5};
    }

    public usk(char[] cArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "messages_annotations._id";
        a.c = new wsy();
        ste steVar = new ste(a.a());
        this.a = steVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "messages_annotations.conversation_id";
        a2.c = new wsy();
        ste steVar2 = new ste(a2.a());
        this.e = steVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.d(true);
        a3.b = new ssv(5);
        a3.a = "messages_annotations.message_id";
        a3.c = new wsy();
        ste steVar3 = new ste(a3.a());
        this.f = steVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.c(true);
        a4.a = "messages_annotations.annotation_type";
        a4.c = new wsy();
        ste steVar4 = new ste(a4.a());
        this.c = steVar4;
        agmi a5 = agmk.a();
        a5.d = 5;
        a5.a = "messages_annotations.annotation_details";
        a5.c = new wsy();
        ste steVar5 = new ste(a5.a());
        this.b = steVar5;
        this.d = new ste[]{steVar, steVar2, steVar3, steVar4, steVar5};
    }

    public usk(byte[] bArr, char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.i(true);
        a.c(true);
        a.d(true);
        a.b = new ssv(17);
        a.a = "message_edits.message_id";
        a.e(true);
        a.c = new wsy();
        sul sulVar = new sul(a.a());
        this.e = sulVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new ssv(18);
        a2.a = "message_edits.latest_message_id";
        a2.c = new wsy();
        sul sulVar2 = new sul(a2.a());
        this.c = sulVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.c(true);
        a3.a = "message_edits.original_rcs_message_id";
        a3.c = new wsy();
        sul sulVar3 = new sul(a3.a());
        this.f = sulVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "message_edits.edited_at_timestamp_ms";
        a4.c = new wsy();
        sul sulVar4 = new sul(a4.a());
        this.b = sulVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "message_edits.received_at_timestamp_ms";
        a5.c = new wsy();
        sul sulVar5 = new sul(a5.a());
        this.a = sulVar5;
        this.d = new sul[]{sulVar, sulVar2, sulVar3, sulVar4, sulVar5};
    }

    public usk(short[] sArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "reminders._id";
        a.c = new wsy();
        tgk tgkVar = new tgk(a.a());
        this.a = tgkVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.c(true);
        a2.d(true);
        a2.b = new tfq(5);
        a2.a = "reminders.message_id";
        a2.c = new wsy();
        tgk tgkVar2 = new tgk(a2.a());
        this.c = tgkVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.d(true);
        a3.b = new tfq(6);
        a3.a = "reminders.conversation_id";
        a3.c = new wsy();
        tgk tgkVar3 = new tgk(a3.a());
        this.b = tgkVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.c(true);
        a4.a = "reminders.trigger_time";
        a4.c = new wsy();
        tgk tgkVar4 = new tgk(a4.a());
        this.f = tgkVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "reminders.status";
        a5.c = new wsy();
        tgk tgkVar5 = new tgk(a5.a());
        this.e = tgkVar5;
        this.d = new tgk[]{tgkVar, tgkVar2, tgkVar3, tgkVar4, tgkVar5};
    }

    public usk(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "restore_workflow_files._id";
        a.c = new wsy();
        tir tirVar = new tir(a.a());
        this.f = tirVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.i(true);
        a2.c(true);
        a2.d(true);
        a2.b = new tif(6);
        a2.a = "restore_workflow_files.workflow_execution_id";
        a2.c = new wsy();
        tir tirVar2 = new tir(a2.a());
        this.e = tirVar2;
        agmi a3 = agmk.a();
        a3.d = 5;
        a3.i(true);
        a3.a = "restore_workflow_files.backup_file";
        a3.c = new wsy();
        tir tirVar3 = new tir(a3.a());
        this.d = tirVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.i(true);
        a4.a = "restore_workflow_files.file_type";
        a4.c = new wsy();
        tir tirVar4 = new tir(a4.a());
        this.b = tirVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.i(true);
        a5.a = "restore_workflow_files.status";
        a5.c = new wsy();
        tir tirVar5 = new tir(a5.a());
        this.c = tirVar5;
        this.a = new tir[]{tirVar, tirVar2, tirVar3, tirVar4, tirVar5};
    }

    public usk(char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "settings._id";
        a.c = new wsy();
        tlc tlcVar = new tlc(a.a());
        this.f = tlcVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.c(true);
        a2.a = "settings.key";
        a2.e(true);
        a2.c = new wsy();
        tlc tlcVar2 = new tlc(a2.a());
        this.b = tlcVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "settings.sub_key";
        a3.e(true);
        a3.c = new wsy();
        tlc tlcVar3 = new tlc(a3.a());
        this.e = tlcVar3;
        agmi a4 = agmk.a();
        a4.d = 5;
        a4.a = "settings.data";
        a4.c = new wsy();
        tlc tlcVar4 = new tlc(a4.a());
        this.d = tlcVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "settings.last_modified_timestamp";
        a5.c = new wsy();
        tlc tlcVar5 = new tlc(a5.a());
        this.c = tlcVar5;
        this.a = new tlc[]{tlcVar, tlcVar2, tlcVar3, tlcVar4, tlcVar5};
    }

    public usk(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.a = "sqlite_master.type";
        a.c = new wsy();
        tll tllVar = new tll(a.a());
        this.f = tllVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "sqlite_master.name";
        a2.c = new wsy();
        tll tllVar2 = new tll(a2.a());
        this.d = tllVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "sqlite_master.tbl_name";
        a3.c = new wsy();
        tll tllVar3 = new tll(a3.a());
        this.e = tllVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "sqlite_master.rootpage";
        a4.c = new wsy();
        tll tllVar4 = new tll(a4.a());
        this.b = tllVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "sqlite_master.sql";
        a5.c = new wsy();
        tll tllVar5 = new tll(a5.a());
        this.c = tllVar5;
        this.a = new tll[]{tllVar, tllVar2, tllVar3, tllVar4, tllVar5};
    }

    public usk() {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.a = "stickers_localization.sticker_set_id";
        a.c = new wsy();
        tmq tmqVar = new tmq(a.a());
        this.f = tmqVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.f(true);
        a2.c(true);
        a2.a = "stickers_localization.sticker_id";
        a2.c = new wsy();
        tmq tmqVar2 = new tmq(a2.a());
        this.c = tmqVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.j(true);
        a3.f(true);
        a3.c(true);
        a3.a = "stickers_localization.locale";
        a3.c = new wsy();
        tmq tmqVar3 = new tmq(a3.a());
        this.b = tmqVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "stickers_localization.display_name";
        a4.c = new wsy();
        tmq tmqVar4 = new tmq(a4.a());
        this.d = tmqVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.d(true);
        a5.a = "stickers_localization.sticker_local_id";
        a5.c = new wsy();
        tmq tmqVar5 = new tmq(a5.a());
        this.e = tmqVar5;
        this.a = new tmq[]{tmqVar, tmqVar2, tmqVar3, tmqVar4, tmqVar5};
    }
}
