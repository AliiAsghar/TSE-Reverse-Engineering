package defpackage;

import android.content.Context;
import android.location.LocationManager;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksr implements ksq {
    private final Context a;
    private final anen b;
    private final lfl c;

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    public ksr(Context context, kkc kkcVar, anen anenVar) {
        this.a = context;
        int i = acdh.a;
        acdo acdoVar = new acdo(context);
        LocationManager locationManager = (LocationManager) kkcVar.c.b();
        locationManager.getClass();
        yjf yjfVar = (yjf) kkcVar.a.b();
        yjfVar.getClass();
        anen anenVar2 = (anen) kkcVar.b.b();
        anenVar2.getClass();
        this.c = new lfl(locationManager, yjfVar, anenVar2, acdoVar);
        this.b = anenVar;
    }

    @Override // defpackage.ksq
    public final akul a() {
        return this.c.a().h(new its(12), this.b);
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul c() {
        return uvl.c();
    }

    @Override // defpackage.uvn
    public final akul d() {
        return this.c.a();
    }

    @Override // defpackage.ksq
    public final ameg e() {
        return ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_LOCATION;
    }

    @Override // defpackage.ksq
    public final String f() {
        return this.a.getString(R.string.location_feedback_data_description);
    }

    @Override // defpackage.ksq
    public final String g() {
        return this.a.getString(R.string.location_feedback_data_detail_title);
    }

    @Override // defpackage.ksq
    public final String h() {
        return this.a.getString(R.string.location_feedback_data_name);
    }

    @Override // defpackage.ksq
    public final String i() {
        return this.a.getString(R.string.location_feedback_data_rationale);
    }

    @Override // defpackage.ksq
    public final String j() {
        return this.a.getString(R.string.location_feedback_data_rationale_title);
    }
}
