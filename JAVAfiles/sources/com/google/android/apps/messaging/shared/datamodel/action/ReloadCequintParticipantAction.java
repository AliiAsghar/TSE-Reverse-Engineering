package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.rdk;
import defpackage.rjj;
import defpackage.rrg;
import defpackage.rrh;
import defpackage.rtz;
import defpackage.rxn;
import defpackage.tap;
import defpackage.ubl;
import defpackage.uhg;
import defpackage.uuf;
import defpackage.xyo;
import defpackage.xze;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReloadCequintParticipantAction extends Action<Void> implements Parcelable {
    private final Context b;
    private final rrh c;
    private final rjj d;
    private final armf e;
    private final uhg f;
    private static final xze a = xze.g("Bugle", "ReloadCequintParticipantAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(13);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjj da();
    }

    public ReloadCequintParticipantAction(Context context, rrh rrhVar, rjj rjjVar, armf armfVar, uhg uhgVar, Parcel parcel) {
        super(parcel, amdy.RELOAD_CEQUINT_PARTICIPANT_ACTION);
        this.b = context;
        this.c = rrhVar;
        this.d = rjjVar;
        this.e = armfVar;
        this.f = uhgVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReloadCequintParticipantAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        String P;
        rrg a2;
        String l = this.u.l("participant_id");
        if (l == null) {
            a.o("Empty id.");
            return null;
        }
        uuf uufVar = rxn.a;
        ParticipantsTable.BindData a3 = ParticipantsTable.a(l);
        if (a3 == null) {
            a.o("Empty participant.");
            return null;
        }
        if (this.c.b(this.b) && (a2 = this.c.a(this.b, (P = a3.P()))) != null) {
            if (a2.d) {
                int a4 = this.u.a("try_count");
                if (a4 > 0) {
                    xyo c = a.c();
                    c.H("Can't get info from Cequint after");
                    c.F(a4 + 1);
                    c.H("tries for");
                    c.C("address", P);
                    c.q();
                    tap z = a3.z();
                    z.l(-2L);
                    this.f.c(z.a());
                    return null;
                }
                this.u.v("participant_id", a3.M());
                this.u.r("try_count", 1);
                this.d.a(a3).x(115, TimeUnit.SECONDS.toMillis(10L));
                return null;
            }
            if (!TextUtils.isEmpty(a2.a)) {
                tap z2 = a3.z();
                z2.u(a2.a);
                z2.t(a2.a);
                z2.Q(a2.c);
                z2.M(a2.b);
                z2.l(-4L);
                this.f.c(z2.a());
                ((rtz) this.e.b()).P(l);
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReloadCequintParticipant.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReloadCequintParticipantAction(Context context, armf<ubl> armfVar, rrh rrhVar, rjj rjjVar, armf<rtz> armfVar2, uhg uhgVar, ParticipantsTable.BindData bindData) {
        super(amdy.RELOAD_CEQUINT_PARTICIPANT_ACTION);
        this.b = context;
        this.c = rrhVar;
        this.d = rjjVar;
        this.e = armfVar2;
        this.f = uhgVar;
        this.u.v("participant_id", bindData.M());
    }
}
