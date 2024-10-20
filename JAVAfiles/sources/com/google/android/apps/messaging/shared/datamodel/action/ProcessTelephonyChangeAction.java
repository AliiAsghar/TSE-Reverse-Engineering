package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentUris;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.alzz;
import defpackage.amdy;
import defpackage.amvm;
import defpackage.aozy;
import defpackage.armf;
import defpackage.mce;
import defpackage.qxi;
import defpackage.ray;
import defpackage.rdh;
import defpackage.rhl;
import defpackage.rji;
import defpackage.rwd;
import defpackage.sya;
import defpackage.uhj;
import defpackage.utz;
import defpackage.uuh;
import defpackage.vjr;
import defpackage.vjs;
import defpackage.wyb;
import defpackage.wye;
import defpackage.wyh;
import defpackage.wyj;
import defpackage.wzp;
import defpackage.wzs;
import defpackage.xca;
import defpackage.xnv;
import defpackage.xyl;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yjy;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessTelephonyChangeAction extends ThrottledAction implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR;
    private static final UriMatcher d;
    private final armf e;
    private final armf f;
    private final yjy g;
    private final vjs h;
    private final uhj i;
    private final armf j;
    private final armf k;
    private static final xze c = xze.g("BugleDataModel", "ProcessTelephonyChangeAction");
    static final utz a = uuh.e(uuh.b, "process_telephony_change_full_sync_threshold", 5);
    static final utz b = uuh.f(uuh.b, "process_telephony_change_spot_sync_age_limit_during_full_sync_millis", 3600000);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rdh NG();
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI("sms", "#", 0);
        uriMatcher.addURI("sms", "inbox/#", 1);
        uriMatcher.addURI("sms", "sent/#", 2);
        uriMatcher.addURI("sms", "outbox/#", 3);
        uriMatcher.addURI("sms", "failed/#", 4);
        uriMatcher.addURI("mms", "#", 10);
        uriMatcher.addURI("mms", "inbox/#", 11);
        uriMatcher.addURI("mms", "sent/#", 12);
        uriMatcher.addURI("mms", "outbox/#", 13);
        CREATOR = new ray(19);
    }

    public ProcessTelephonyChangeAction(Context context, armf<rwd> armfVar, armf<wzp> armfVar2, yjy yjyVar, mce mceVar, rji rjiVar, vjs vjsVar, uhj uhjVar, wyj wyjVar, armf<wzs> armfVar3, armf<xnv> armfVar4, Uri uri) {
        super(amdy.PROCESS_TELEPHONY_CHANGE_ACTION);
        this.e = armfVar;
        this.f = armfVar2;
        this.g = yjyVar;
        this.h = vjsVar;
        this.i = uhjVar;
        this.j = armfVar3;
        this.k = armfVar4;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(uri);
        this.u.u("uri_list", arrayList);
    }

    public static Uri l(Uri uri) {
        if (uri != null) {
            int match = d.match(uri);
            if (match != 0) {
                if (match == 1 || match == 2 || match == 3 || match == 4) {
                    return m(Telephony.Sms.CONTENT_URI, uri);
                }
                switch (match) {
                    case 10:
                        return uri;
                    case 11:
                    case 12:
                    case 13:
                        return m(Telephony.Mms.CONTENT_URI, uri);
                    default:
                        return null;
                }
            }
            return uri;
        }
        return null;
    }

    private static Uri m(Uri uri, Uri uri2) {
        try {
            return Uri.withAppendedPath(uri, Long.toString(ContentUris.parseId(uri2)));
        } catch (NumberFormatException | UnsupportedOperationException unused) {
            xyo b2 = c.b();
            b2.H("invalid uri");
            b2.H(uri2);
            b2.H("for");
            b2.H(uri);
            b2.q();
            return null;
        }
    }

    private static boolean n(MessageCoreData messageCoreData) {
        if (messageCoreData != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessTelephonyChange.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 116;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return 10L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "ProcessTelephonyChangeAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        Optional empty;
        boolean z;
        boolean z2;
        int b2;
        boolean z3;
        boolean z4;
        long j;
        yjy yjyVar = this.g;
        ArrayList m = this.u.m("uri_list");
        int c2 = yjyVar.c();
        if (m.size() > ((Integer) a.e()).intValue()) {
            empty = Optional.of(amvm.TELEPHONY_CHANGE_TOO_MANY_CHANGES);
        } else if (Collection.EL.stream(m).anyMatch(new qxi(4))) {
            empty = Optional.of(amvm.TELEPHONY_CHANGE_NULL_URI);
        } else {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            if (((wzp) this.f.b()).u()) {
                c.o("Found sync already running, not requesting a new sync.");
                return;
            } else {
                ((wzp) this.f.b()).k((amvm) empty.get());
                return;
            }
        }
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) m.get(i);
            xze xzeVar = c;
            xyo c3 = xzeVar.c();
            c3.H("external telephony provider change ");
            c3.H(uri);
            c3.q();
            Uri l = l(uri);
            if (l == null) {
                xzeVar.o("not single message change, force full sync");
                ((wzp) this.f.b()).k(amvm.TELEPHONY_CHANGE);
            } else {
                wyb r = ((wzs) this.j.b()).r(l, c2);
                MessageCoreData t = ((rwd) this.e.b()).t(l);
                if (r != null) {
                    int a2 = r.a();
                    if (a2 != 0) {
                        if (a2 != 1) {
                            xyl.c("ProcessTelephonyChangeAction: wrong message protocol " + r.a());
                            j = -1;
                        } else {
                            j = ((wye) r).i;
                        }
                    } else {
                        j = ((wyh) r).i;
                    }
                    if (j >= 0) {
                        z = true;
                        if (!z && !n(t)) {
                            if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
                                long millis = Duration.between(Instant.ofEpochMilli(r.c()), ((xnv) this.k.b()).f()).toMillis();
                                utz utzVar = b;
                                if (millis > ((Long) utzVar.e()).longValue() && ((wzp) this.f.b()).u()) {
                                    xyo c4 = xzeVar.c();
                                    c4.H("Message is older than age limit while full sync in progress");
                                    c4.z("message uri", uri);
                                    c4.z("spotSyncAgeLimitDuringFullSyncMillis", utzVar.e());
                                    c4.q();
                                } else {
                                    xyo c5 = xzeVar.c();
                                    c5.H("Message exists in Telephony but not in Bugle. Requesting Spot Sync.");
                                    c5.z("message uri", uri);
                                    c5.q();
                                    ((wzp) this.f.b()).m(uri, Instant.ofEpochMilli(r.c()));
                                }
                            } else {
                                xyo c6 = xzeVar.c();
                                c6.H("sync new message.");
                                c6.H(uri);
                                c6.q();
                                ((wzp) this.f.b()).m(uri, Instant.ofEpochMilli(r.c()));
                            }
                        } else if (z && n(t)) {
                            xyo c7 = xzeVar.c();
                            c7.H("sync deleted message.");
                            c7.H(uri);
                            c7.q();
                            ((wzp) this.f.b()).m(uri, Instant.ofEpochMilli(t.n()));
                        } else if (!z && n(t)) {
                            sya syaVar = new sya();
                            syaVar.aj("ProcessTelephonyChangeAction#executeAction");
                            int b3 = r.b();
                            int a3 = r.a();
                            if (a3 != 0) {
                                if (a3 != 1) {
                                    xyl.c("ProcessTelephonyChangeAction: wrong message protocol " + r.a());
                                    b2 = 0;
                                } else {
                                    wye wyeVar = (wye) r;
                                    b2 = xca.a(wyeVar.j(), wyeVar.i(), b3);
                                }
                            } else {
                                int i2 = ((wyh) r).h;
                                if (i2 != 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                b2 = xca.b(z2, i2, b3);
                            }
                            if (b2 != t.j()) {
                                syaVar.L(b2);
                                syaVar.u(r.b());
                            }
                            int a4 = r.a();
                            if (a4 != 0) {
                                if (a4 != 1) {
                                    xyl.c("ProcessTelephonyChangeAction: wrong message protocol " + r.a());
                                    z3 = false;
                                } else {
                                    z3 = ((wye) r).m;
                                }
                            } else {
                                z3 = ((wyh) r).l;
                            }
                            if (z3 != t.cz()) {
                                syaVar.o(z3);
                            }
                            int a5 = r.a();
                            if (a5 != 0) {
                                if (a5 != 1) {
                                    xyl.c("ProcessTelephonyChangeAction: wrong message protocol " + r.a());
                                    z4 = false;
                                } else {
                                    z4 = ((wye) r).l;
                                }
                            } else {
                                z4 = ((wyh) r).k;
                            }
                            if (z4 != t.cA()) {
                                syaVar.y(z4);
                            }
                            if (!syaVar.a().m()) {
                                xyo c8 = xzeVar.c();
                                c8.H("update message");
                                c8.H(r.d());
                                c8.H("with");
                                c8.H(syaVar);
                                c8.q();
                                if (((rwd) this.e.b()).O(t.z(), t.B(), syaVar)) {
                                    this.i.c();
                                    vjs vjsVar = this.h;
                                    aozy createBuilder = vjr.a.createBuilder();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    vjr.a((vjr) createBuilder.b);
                                    vjsVar.d((vjr) createBuilder.s());
                                } else {
                                    xyo e = xzeVar.e();
                                    e.H("failed to update message.");
                                    e.H(r.d());
                                    e.q();
                                }
                            }
                        } else {
                            xzeVar.q("changed message not found anywhere");
                        }
                    }
                }
                z = false;
                if (!z) {
                }
                if (z) {
                }
                if (!z) {
                }
                xzeVar.q("changed message not found anywhere");
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        rhl rhlVar = this.u;
        ArrayList m = throttledAction.u.m("uri_list");
        ArrayList m2 = rhlVar.m("uri_list");
        HashSet L = alzz.L(m.size() + m2.size());
        L.addAll(m);
        L.addAll(m2);
        ArrayList arrayList = new ArrayList(L.size());
        arrayList.addAll(L);
        this.u.u("uri_list", arrayList);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessTelephonyChangeAction(armf armfVar, armf armfVar2, yjy yjyVar, vjs vjsVar, uhj uhjVar, armf armfVar3, armf armfVar4, Parcel parcel) {
        super(parcel, amdy.PROCESS_TELEPHONY_CHANGE_ACTION);
        this.e = armfVar;
        this.f = armfVar2;
        this.g = yjyVar;
        this.h = vjsVar;
        this.i = uhjVar;
        this.j = armfVar3;
        this.k = armfVar4;
    }
}
