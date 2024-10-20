package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ikm implements ancr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ikm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, ncq] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        akul c;
        char c2;
        Object obj;
        akul A;
        akul c3;
        int i = 18;
        int i2 = 4;
        int i3 = 10;
        switch (this.b) {
            case 0:
                ikr ikrVar = (ikr) this.a;
                c = qjh.c(ikrVar.a, arpj.a, arwf.a, new ikq(ikrVar, (arpe) null, 2, (byte[]) null));
                return c;
            case 1:
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(xxy.c);
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    alhr alhrVar = (alhr) arrayList2.get(i4);
                    Object e = ((utz) alhrVar.get()).e();
                    boolean equals = Objects.equals(e, ((utz) alhrVar.get()).f());
                    String j = ((utz) alhrVar.get()).j();
                    if (true != equals) {
                        c2 = '*';
                    } else {
                        c2 = ' ';
                    }
                    sb.append(String.format("%c%s: %s\n", Character.valueOf(c2), j, e));
                }
                Object obj2 = this.a;
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "CmsPhenotype"));
                akul ag = aktp.ag(arrayList);
                ihv ihvVar = (ihv) obj2;
                if (((ansy) ((nkh) ihvVar.b).a.b()).e("bugle.use_detailed_backup_timing_stats")) {
                    ag = ag.i(new ici(obj2, 6), ihvVar.a);
                }
                if (((ansy) ((nki) ihvVar.c).a.b()).e("bugle.use_detailed_restore_timing_stats")) {
                    return ag.i(new ici(obj2, 7), ihvVar.a);
                }
                return ag;
            case 2:
                return ((yja) ((Optional) ((apxx) ((itb) this.a).T).a).get()).a();
            case 3:
                iuh iuhVar = (iuh) this.a;
                if (((iug) iuhVar.a.c.l()).c) {
                    return aktp.ag(Boolean.valueOf(!r1.e));
                }
                return iuhVar.a.c.j(new its(i2)).h(new its(5), andi.a);
            case 4:
                kku kkuVar = (kku) this.a;
                String string = kkuVar.d.getString("EXTRA_COLLECTOR_KEY");
                d.s(!TextUtils.isEmpty(string));
                kkt kktVar = (kkt) kkuVar.c.get(string);
                kktVar.getClass();
                return kktVar.a(kkuVar.d).h(new its(i3), kkuVar.a);
            case 5:
                return aktp.ad(this.a);
            case 6:
                return aktp.ad(this.a);
            case 7:
                return aktp.ad(this.a);
            case 8:
                return aktp.ad(this.a);
            case 9:
                return aktp.ad(this.a);
            case 10:
                return this.a.b();
            case 11:
                nes nesVar = (nes) this.a;
                return nesVar.d.b(nesVar.b);
            case 12:
                nes nesVar2 = (nes) this.a;
                return nesVar2.e.b(nesVar2.b);
            case 13:
                Object obj3 = this.a;
                nga ngaVar = (nga) obj3;
                if (((olx) ngaVar.d.b()).a()) {
                    vpk vpkVar = (vpk) ngaVar.e.b();
                    int i5 = ngaVar.f;
                    return (((pce) vpkVar.d.b()).a() ? qjh.c(vpkVar.h, arpj.a, arwf.a, new jmk(vpkVar, i5, (arpe) null, 12)) : qjh.c(vpkVar.g, arpj.a, arwf.a, new jmk(vpkVar, i5, (arpe) null, 13, (byte[]) null))).i(new lso(obj3, 20), ngaVar.b);
                }
                Optional flatMap = ngaVar.d().flatMap(new ndz(i));
                if (flatMap.isEmpty()) {
                    alwl alwlVar = (alwl) nga.a.i();
                    alwlVar.X(ydl.t, Integer.valueOf(ngaVar.f));
                    alwlVar.X(ydl.L, ngaVar.g);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateSupplier", "getEtouffeeEnabledLegacy", 148, "EtouffeeEncryptionStateSupplier.java")).q("SelfIdentity encryption state CANNOT be retrieved. Missing MSISDN.");
                    return aktp.ag(false);
                }
                return ((ttj) ngaVar.c.b()).b(((qei) flatMap.get()).d);
            case 14:
                arbj arbjVar = new arbj((byte[]) null, (short[]) null);
                arbjVar.w(ajqk.STOP);
                IsComposingMessage u = arbjVar.u();
                qdn qdnVar = (qdn) this.a;
                return ((qcv) qdnVar.d.b()).a(u, qdnVar.b.a);
            case 15:
                Object obj4 = this.a;
                qqx qqxVar = (qqx) obj4;
                if (qqxVar.d == null) {
                    obj = qqxVar.b.get();
                    return ((wul) obj).h().i(new prf(obj4, i3), qqxVar.c);
                }
                return aktp.ag(Optional.of(qqxVar.d));
            case 16:
                Object obj5 = this.a;
                ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction = (ProcessConversationUpdateAsyncAction) obj5;
                alog c4 = processConversationUpdateAsyncAction.b.c();
                if (c4.isEmpty()) {
                    return aktp.ag(null);
                }
                akrh e2 = aktp.e("ProcessConversationUpdateAsyncAction#getConversationsUpdateResponse_dsdrGroupsFlag");
                try {
                    if (((okf) ((ProcessConversationUpdateAsyncAction) obj5).l.b()).a()) {
                        ConversationIdType b = ruy.b(((ProcessConversationUpdateAsyncAction) obj5).u.l("conversation_id_key"));
                        wyp wypVar = ((ProcessConversationUpdateAsyncAction) obj5).m;
                        if (b.b()) {
                            A = wypVar.A();
                        } else {
                            A = wypVar.z(new BugleConversationId(b));
                        }
                    } else {
                        A = ((ProcessConversationUpdateAsyncAction) obj5).m.A();
                    }
                    e2.close();
                    return A.i(new prf(obj5, i), processConversationUpdateAsyncAction.e).i(new prf(obj5, 19), processConversationUpdateAsyncAction.d).i(new qdl(obj5, c4, 13), processConversationUpdateAsyncAction.e);
                } catch (Throwable th) {
                    try {
                        e2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 17:
                ryx ryxVar = (ryx) this.a;
                if (((yyt) ryxVar.j.b()).c()) {
                    ynr ynrVar = (ynr) ryxVar.k.b();
                    c3 = qjh.c(ynrVar.c, arpj.a, arwf.a, new xjs(ynrVar, (arpe) null, 14));
                    return c3.h(new rgh(i2), ryxVar.m);
                }
                return aktp.ag(Optional.empty());
            case 18:
                return ((vbu) this.a).c();
            case 19:
                return aktp.ag(null);
            default:
                return aktp.ag(null);
        }
    }
}
