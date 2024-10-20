package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxq {
    public static final alwo a = alwo.o("BugleDataModel");
    public static final xze b = xze.g("BugleDataModel", "ParticipantDatabaseOperations");
    public final Optional c;
    public final Optional d;
    public final osz e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final qyd k;
    public final oeo l;
    public final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;

    public rxq(armf armfVar, Optional optional, Optional optional2, osz oszVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, qyd qydVar, oeo oeoVar, armf armfVar12) {
        this.n = armfVar;
        this.c = optional;
        this.d = optional2;
        this.e = oszVar;
        this.o = armfVar2;
        this.p = armfVar3;
        this.f = armfVar4;
        this.q = armfVar5;
        this.g = armfVar6;
        this.r = armfVar7;
        this.s = armfVar8;
        this.h = armfVar9;
        this.i = armfVar10;
        this.j = armfVar11;
        this.k = qydVar;
        this.l = oeoVar;
        this.m = armfVar12;
    }

    public static alog d(ConversationIdType conversationIdType) {
        alog cR;
        akrh e = aktp.e("ParticipantDatabaseOperations#getOtherParticipants_dsdrGroupsFlag");
        try {
            if (ody.a()) {
                taz e2 = ParticipantsTable.e();
                e2.w("getOtherParticipants");
                e2.g(new rxb(conversationIdType, 8));
                cR = ((tav) e2.b().n()).cR();
            } else {
                taz e3 = ParticipantsTable.e();
                e3.w("getOtherParticipants");
                e3.g(new rxb(conversationIdType, 9));
                cR = ((tav) e3.b().n()).cR();
            }
            e.close();
            return cR;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void l(ParticipantsTable.BindData bindData) {
        alwl alwlVar = (alwl) a.h();
        alwlVar.Z(alwk.FULL);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "logInsertionFailureToFlogger", 677, "ParticipantDatabaseOperations.java")).M("Unable to insert new participant: isValidPhoneNumberData = [%s], isCheckConstraintEnabledViaPhenotype = [%s], subId = [%s], normalizedDestinationIsNullOrEmpty = [%s], sendDestinationIsNullOrEmpty = [%s], displayDestinationIsNullOrEmpty = [%s]", new aomj(aomi.NO_USER_DATA, Boolean.valueOf(bindData.U())), new aomj(aomi.NO_USER_DATA, Boolean.valueOf(bindData.S())), new aomj(aomi.NO_USER_DATA, Integer.valueOf(bindData.p())), new aomj(aomi.NO_USER_DATA, Boolean.valueOf(TextUtils.isEmpty(bindData.O()))), new aomj(aomi.NO_USER_DATA, Boolean.valueOf(TextUtils.isEmpty(bindData.P()))), new aomj(aomi.NO_USER_DATA, Boolean.valueOf(TextUtils.isEmpty(bindData.J()))));
    }

    public static boolean o(ParticipantsTable.BindData bindData) {
        if (!TextUtils.isEmpty(bindData.N())) {
            return true;
        }
        return false;
    }

    public final ParticipantsTable.BindData a(String str) {
        ParticipantsTable.BindData bindData;
        akrh e = aktp.e("ParticipantDatabaseOperations#getExistingParticipant");
        try {
            xyl.h();
            if (str == null) {
                bindData = null;
            } else {
                bindData = (ParticipantsTable.BindData) ParticipantsTable.h(str, new rxo(4));
            }
            e.close();
            return bindData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData b(String str) {
        ParticipantsTable.BindData bindData;
        akrh e = aktp.e("ParticipantDatabaseOperations#getExistingRbmBot");
        try {
            String k = k(str);
            ParticipantsTable.BindData bindData2 = null;
            if (!TextUtils.isEmpty(k)) {
                bindData = a(k);
                if (bindData != null) {
                    xyo a2 = b.a();
                    a2.H("getExistingRbmBot: found");
                    a2.e(k);
                    a2.H("for participant");
                    a2.j(str);
                    a2.H("(is bot =");
                    a2.I(vcp.k(bindData));
                    a2.t(')');
                    a2.q();
                } else {
                    xyo e2 = b.e();
                    e2.H("Found existing participant");
                    e2.e(k);
                    e2.H("but its participant is null.");
                    e2.q();
                }
            } else {
                bindData = null;
            }
            if (bindData != null) {
                if (vcp.k(bindData)) {
                    bindData2 = bindData;
                }
            }
            e.close();
            return bindData2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData c(String str) {
        akrh e = aktp.e("ParticipantDatabaseOperations#getOtherParticipantByNormalizedDestination");
        try {
            xyl.h();
            taz e2 = ParticipantsTable.e();
            e2.w("getOtherParticipantByNormalizedDestination");
            e2.g(new rxb(str, 12));
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ((tav) e2.b().n()).cO();
            e.close();
            return bindData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog e() {
        akrh e = aktp.e("ParticipantDatabaseOperations#getParticipants");
        try {
            xyl.h();
            taz e2 = ParticipantsTable.e();
            e2.w("getParticipants");
            e2.q();
            alog t = e2.b().t();
            e.close();
            return t;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String f(tap tapVar) {
        String k;
        String str = tapVar.f;
        if (ryg.m(tapVar)) {
            k = ((SelfIdentityIdImpl) ((ryg) this.p.b()).f(tapVar.d).g()).a;
        } else if (str == null) {
            k = null;
        } else {
            k = k(str);
        }
        if (k != null) {
            String str2 = tapVar.a;
            boolean z = true;
            if (str2 != null && !str2.equals(k)) {
                z = false;
            }
            albo.A(z, "Looked up id doesn't match id in participant", new Object[0]);
            tapVar.v(k);
        }
        return k;
    }

    public final String g(ParticipantsTable.BindData bindData) {
        return j(bindData, false);
    }

    public final String h(tap tapVar) {
        return i(tapVar, false);
    }

    public final String i(final tap tapVar, final boolean z) {
        String f;
        akrh e = aktp.e("ParticipantDatabaseOperations#getOrCreateParticipant");
        try {
            xyl.h();
            String f2 = f(tapVar);
            if (f2 != null) {
                ((alwl) a.n().h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "getOrCreateParticipant", 493, "ParticipantDatabaseOperations.java")).t("Participant id %s has already existed, returning immediately.", f2);
            } else {
                String str = null;
                if (tapVar.q != -1) {
                    ((lru) this.s.b()).i(tapVar);
                } else {
                    ((qyb) this.g.b()).f(tapVar);
                    String str2 = tapVar.f;
                    if (((uhg) this.n.b()).e(tapVar) && !TextUtils.equals(str2, tapVar.f) && (f = f(tapVar)) != null) {
                        str = f;
                    }
                    ((qyb) this.g.b()).f(tapVar);
                }
                if (str != null) {
                    e.close();
                    return str;
                }
                f2 = (String) ((agnq) this.q.b()).c("ParticipantDatabaseOperations#getOrCreateParticipant", new alhr() { // from class: rxp
                    /* JADX WARN: Type inference failed for: r6v24, types: [armf, java.lang.Object] */
                    @Override // defpackage.alhr
                    public final Object get() {
                        boolean z2;
                        boolean z3;
                        ParticipantsTable.BindData a2;
                        long longValue;
                        rxq rxqVar = rxq.this;
                        tap tapVar2 = tapVar;
                        String f3 = rxqVar.f(tapVar2);
                        try {
                            if (f3 != null) {
                                ((alwl) rxq.a.n().h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "getOrCreateParticipant", 514, "ParticipantDatabaseOperations.java")).t("Participant id %s has already existed, returning immediately.", f3);
                                tapVar2.v(f3);
                            } else {
                                if (tapVar2.a == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                d.t(z2, "Why are we inserting a participant that already has an id??");
                                if (z) {
                                    tapVar2.g(xxw.RESTORED_FROM_TELEPHONY);
                                }
                                if (rxqVar.l.a() && tapVar2.d != -2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    rxqVar.k.e(tapVar2);
                                    a2 = tapVar2.a();
                                } else {
                                    a2 = tapVar2.a();
                                }
                                if (z3) {
                                    longValue = rxqVar.k.b(a2);
                                } else {
                                    if (((obw) rxqVar.m.b()).a()) {
                                        if (!TextUtils.isEmpty(a2.P())) {
                                            if (TextUtils.isEmpty(a2.O())) {
                                                rxqVar.q(3);
                                                rxq.l(a2);
                                                throw new IllegalArgumentException(String.format("unable to insert participant normalizedDestination=%s", a2.O()));
                                            }
                                        } else {
                                            rxqVar.q(3);
                                            rxq.l(a2);
                                            throw new IllegalArgumentException(String.format("unable to insert participant sendDestination=%s", a2.P()));
                                        }
                                    }
                                    longValue = a2.D().longValue();
                                }
                                if (longValue >= 0 && ryg.l(a2)) {
                                    tki a3 = tkr.a();
                                    a3.d(a2.M());
                                    a3.e(a2.O());
                                    a3.f(tapVar2.e);
                                    a3.h(a2.p());
                                    a3.j(a2.Q());
                                    a3.i(a2.q());
                                    qyd.a(a3.a());
                                }
                                if (longValue != -1) {
                                    ((alwl) ((alwl) rxq.a.g()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "getOrCreateParticipant", 589, "ParticipantDatabaseOperations.java")).A("ParticipantDatabaseOperations: Created id=%d with sendDestination %s", longValue, ((qxr) rxqVar.i.b()).b().a(a2.P()).b);
                                    rxqVar.q(2);
                                    if (rxqVar.e.a()) {
                                        rxqVar.d.ifPresent(new rug(a2, 10));
                                    } else {
                                        rxqVar.c.ifPresent(new rug(a2, 11));
                                    }
                                    uie uieVar = (uie) rxqVar.j.b();
                                    String l = Long.toString(longValue);
                                    l.getClass();
                                    ((agnq) uieVar.b.b()).h(new rxa(2), "OnParticipantInsertedProxy#afterParticipantInserted-".concat(l), new rui(uieVar, 2));
                                    f3 = Long.toString(longValue);
                                    ((qyb) rxqVar.g.b()).d(a2);
                                    ((qyg) rxqVar.f.b()).b(f3, a2);
                                    if (f3 != null) {
                                        tapVar2.v(f3);
                                    }
                                } else {
                                    rxqVar.q(3);
                                    rxq.l(a2);
                                    throw new IllegalArgumentException(String.format("unable to insert participant %s", yyb.bh(a2.a())));
                                }
                            }
                            return f3;
                        } catch (Throwable th) {
                            if (f3 != null) {
                                tapVar2.v(f3);
                            }
                            throw th;
                        }
                    }
                });
            }
            e.close();
            return f2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String j(ParticipantsTable.BindData bindData, boolean z) {
        String M = bindData.M();
        if (M != null) {
            return M;
        }
        String i = i(bindData.z(), z);
        bindData.a = i;
        return i;
    }

    public final String k(String str) {
        akrh e = aktp.e("ParticipantDatabaseOperations#getOtherParticipantId");
        try {
            String a2 = ((qyb) this.g.b()).a(str);
            if (TextUtils.isEmpty(a2)) {
                tav tavVar = null;
                a2 = null;
                a2 = null;
                try {
                    taz e2 = ParticipantsTable.e();
                    e2.w("getOtherParticipantId-participants1");
                    e2.g(new rxb(str, 15));
                    e2.e(new rxo(6));
                    tav tavVar2 = (tav) e2.b().n();
                    try {
                        if (!tavVar2.moveToFirst()) {
                            xca xcaVar = (xca) this.o.b();
                            if (msx.i(str) && !xcaVar.j(str)) {
                                tavVar2.close();
                                taz e3 = ParticipantsTable.e();
                                e3.w("getOtherParticipantId-participants2");
                                e3.g(new rxb(str, 16));
                                e3.e(new rxo(7));
                                tav tavVar3 = (tav) e3.b().n();
                                try {
                                    if (!tavVar3.moveToFirst()) {
                                        tavVar3.close();
                                    } else {
                                        tavVar = tavVar3;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    tavVar = tavVar3;
                                    if (tavVar != null) {
                                        tavVar.close();
                                    }
                                    throw th;
                                }
                            } else {
                                tavVar2.close();
                            }
                        } else {
                            tavVar = tavVar2;
                        }
                        xyl.a(1, tavVar.getCount());
                        String K = tavVar.K();
                        if (!TextUtils.isEmpty(K)) {
                            ((qyb) this.g.b()).c(str, K);
                        }
                        tavVar.close();
                        a2 = K;
                    } catch (Throwable th2) {
                        th = th2;
                        tavVar = tavVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            e.close();
            return a2;
        } catch (Throwable th4) {
            try {
                e.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public final void m(int i, String str) {
        if (i != 1) {
            b.m(str);
            ((rye) this.r.b()).a(4, 3);
        } else {
            b.p(str);
            ((rye) this.r.b()).a(4, 2);
        }
    }

    public final void n(String str, ParticipantCoreColor participantCoreColor) {
        akrh e = aktp.e("ParticipantDatabaseOperations#maybeUpdateParticipantColor");
        try {
            xyl.h();
            ((agnq) this.q.b()).e("ParticipantDatabaseOperations#maybeUpdateParticipantColor", new rvz((Object) this, (Object) participantCoreColor, (Object) str, 3, (char[]) null));
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean p(String str, Uri uri) {
        String str2;
        akrh e = aktp.e("ParticipantDatabaseOperations#updateParticipantPhotoUri");
        try {
            xyl.h();
            akrh e2 = aktp.e("ParticipantDatabaseOperations#getParticipantPhotoUri");
            try {
                Uri uri2 = (Uri) ParticipantsTable.h(str, new rxo(2));
                e2.close();
                boolean z = false;
                if ((uri == null && uri2 == null) || (uri != null && uri.equals(uri2))) {
                    xyo a2 = b.a();
                    a2.H("Not updating photo uri; existing photo uri matches new uri for");
                    a2.C("participantId", str);
                    a2.q();
                    e.close();
                    return false;
                }
                tbb f = ParticipantsTable.f();
                f.aj("updateParticipantPhotoUri");
                f.D(uri);
                f.M(new rxb(str, 13));
                int e3 = f.a().e();
                if (e3 != 1) {
                    str2 = "Failed to update participants' photo Uri.";
                } else {
                    str2 = "Successfully updated participants' photo Uri.";
                }
                m(e3, str2);
                if (e3 > 0) {
                    z = true;
                }
                e.close();
                return z;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void q(int i) {
        ((rye) this.r.b()).a(2, i);
    }
}
