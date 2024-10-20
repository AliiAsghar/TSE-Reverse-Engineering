package defpackage;

import android.content.ComponentName;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmk extends arpw implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(abvz abvzVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.c = i2;
        this.b = abvzVar;
        this.a = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((jmk) c(obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((jmk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((jmk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((jmk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((jmk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((jmk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((jmk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((jmk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v42, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        switch (this.c) {
            case 0:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 1:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 2:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 3:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 4:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 5:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 6:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 7:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 8:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 9:
                aqil.P(obj);
                ((boolean[]) this.b)[this.a] = true;
                return arnb.a;
            case 10:
                aqil.P(obj);
                return Boolean.valueOf(((reb) this.b).l.c(this.a));
            case 11:
                aqil.P(obj);
                return ((reb) this.b).j.f(this.a);
            case 12:
                aqil.P(obj);
                return ((vpk) this.b).a(this.a);
            case 13:
                aqil.P(obj);
                return ((vpk) this.b).a(this.a);
            case 14:
                aqil.P(obj);
                final int i = this.a;
                Object obj2 = this.b;
                akrh e = aktp.e("EmergencyConversationTombstoneEnforcer#ensureTombstoneAlignedWithSatelliteSession");
                try {
                    List list = wsd.a;
                    agnq agnqVar = (agnq) ((wsd) obj2).h.b();
                    final wsd wsdVar = (wsd) obj2;
                    agnqVar.e("EmergencyConversationTombstoneEnforcer#ensureTombstoneAlignedWithSatelliteSession", new Runnable() { // from class: wsc
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessageCoreData k;
                            List list2 = wsd.a;
                            wsd wsdVar2 = wsd.this;
                            Optional n = wsdVar2.c.n(wsdVar2.d.l());
                            n.getClass();
                            smr smrVar = (smr) arsd.k(n);
                            if (smrVar != null && (k = ((rwd) wsdVar2.e.b()).k(smrVar.x())) != null && !k.co() && !wsd.a.contains(Integer.valueOf(k.j()))) {
                                if (((ansy) ((nur) wsdVar2.k).a.b()).e("bugle.disable_unexpected_session_end_on_new_messages")) {
                                    rwd rwdVar = (rwd) wsdVar2.e.b();
                                    syc sycVar = new syc();
                                    sycVar.f(smrVar.x());
                                    sycVar.P(239);
                                    MessageCoreData j = rwdVar.j(new syb(sycVar));
                                    rwd rwdVar2 = (rwd) wsdVar2.e.b();
                                    ConversationIdType x = smrVar.x();
                                    akrh e2 = aktp.e("MessageDatabaseOperations#getLatestEndOfEmergencyMessage");
                                    try {
                                        tbs d = PartsTable.d();
                                        d.g(new rwb(x, 6));
                                        d.d(new rwc(0));
                                        tbr b = d.b();
                                        alog v = alog.v(247, 246, 249, 248, 250);
                                        sxy d2 = MessagesTable.d();
                                        d2.g(new rwb(x, 7));
                                        d2.d(new rwc(2));
                                        d2.g(new rbp(v, b, 17, null));
                                        d2.h(new atkn((Object) MessagesTable.c.i, false));
                                        d2.u(1);
                                        Optional findFirst = Collection.EL.stream(rwdVar2.D(d2.b())).findFirst();
                                        e2.close();
                                        if (findFirst.isPresent() && (j == null || ((MessageCoreData) findFirst.get()).n() > j.n())) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            e2.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                                int i2 = i;
                                alvw i3 = wsd.b.i();
                                i3.X(alwp.a, "BugleEmergencySOS");
                                ((alvg) i3.h("com/google/android/apps/messaging/shared/satelliteapi/session/EmergencyConversationTombstoneEnforcer", "ensureTombstoneAlignedWithSatelliteSession", 129, "EmergencyConversationTombstoneEnforcer.kt")).t("eSOS Conversation missing tombstone while satellite mode is [%s]. Adding one now.", wch.w(i2));
                                alog alogVar = (alog) wsdVar2.g.a().c();
                                if (alogVar.size() != 1) {
                                    alvw i4 = wsd.b.i();
                                    i4.X(alwp.a, "BugleEmergencySOS");
                                    ((alvg) i4.h("com/google/android/apps/messaging/shared/satelliteapi/session/EmergencyConversationTombstoneEnforcer", "insertEmergencyUnexpectedEnd", 183, "EmergencyConversationTombstoneEnforcer.kt")).r("Unexpected number of satellite self identities %s. Skipping tombstone insert.", alogVar.size());
                                    return;
                                }
                                znj znjVar = wsdVar2.l;
                                alogVar.getClass();
                                String str = ((SelfIdentityIdImpl) ((nfw) aqjn.X(alogVar)).f()).a;
                                SelfIdentityId f = ((nfw) aqjn.X(alogVar)).f();
                                ConversationIdType x2 = smrVar.x();
                                x2.getClass();
                                Instant f2 = wsdVar2.i.f();
                                f2.getClass();
                                MessageCoreData ad = znjVar.ad(str, f, x2, aoue.k(f2), wqh.e);
                                wsdVar2.f.a(ad);
                                ((ruq) wsdVar2.j.b()).d(smrVar.x(), ad.B(), Long.valueOf(ad.n()), tqc.UNARCHIVED, false);
                            }
                        }
                    });
                    armd.i(e, null);
                    return arnb.a;
                } finally {
                }
            case 15:
                aqil.P(obj);
                try {
                    ((wwt) this.b).b.getPackageManager().setComponentEnabledSetting(new ComponentName(((wwt) this.b).b, (Class<?>) AsyncTelephonySimStateReceiver.class), this.a, 1);
                } catch (Exception e2) {
                    ((alvg) ((alvg) wwt.a.h()).g(e2).h("com/google/android/apps/messaging/shared/simstatetracker/TelephonySimStateReceiverProviderImpl$overrideAsyncTelephonySimStateReceiverState$1", "invokeSuspend", 33, "TelephonySimStateReceiverProviderImpl.kt")).q("Failed to override manifest entry for AsyncTelephonySimStateReceiver.");
                }
                return arnb.a;
            default:
                aqil.P(obj);
                ((mbl) ((abvz) this.b).c.b()).e("Bugle.Spam.UrlClick.Counts", this.a);
                return arnb.a;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.c) {
            case 0:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 0);
            case 1:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 1, (byte[]) null);
            case 2:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 2, (char[]) null);
            case 3:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 3, (short[]) null);
            case 4:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 4, (int[]) null);
            case 5:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 5, (boolean[]) null);
            case 6:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 6, (float[]) null);
            case 7:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 7, (byte[][]) null);
            case 8:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 8, (char[][]) null);
            case 9:
                return new jmk((boolean[]) this.b, this.a, arpeVar, 9, (short[][]) null);
            case 10:
                return new jmk((reb) this.b, this.a, arpeVar, 10);
            case 11:
                return new jmk((reb) this.b, this.a, arpeVar, 11, (byte[]) null);
            case 12:
                return new jmk((vpk) this.b, this.a, arpeVar, 12);
            case 13:
                return new jmk((vpk) this.b, this.a, arpeVar, 13, (byte[]) null);
            case 14:
                return new jmk((wsd) this.b, this.a, arpeVar, 14);
            case 15:
                return new jmk((wwt) this.b, this.a, arpeVar, 15);
            default:
                return new jmk((abvz) this.b, this.a, arpeVar, 16);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(reb rebVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.c = i2;
        this.b = rebVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(reb rebVar, int i, arpe arpeVar, int i2, byte[] bArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = rebVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(vpk vpkVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.c = i2;
        this.b = vpkVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(vpk vpkVar, int i, arpe arpeVar, int i2, byte[] bArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = vpkVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(wsd wsdVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.c = i2;
        this.b = wsdVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(wwt wwtVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.c = i2;
        this.b = wwtVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, byte[] bArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, char[] cArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, float[] fArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, int[] iArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, short[] sArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, boolean[] zArr2) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, byte[][] bArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, char[][] cArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(boolean[] zArr, int i, arpe arpeVar, int i2, short[][] sArr) {
        super(2, arpeVar);
        this.c = i2;
        this.b = zArr;
        this.a = i;
    }
}
