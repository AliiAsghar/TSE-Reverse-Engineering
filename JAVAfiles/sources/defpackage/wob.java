package defpackage;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wob implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ wob(int i, xxh xxhVar, String str, int i2) {
        this.d = i2;
        this.a = i;
        this.c = xxhVar;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean test;
        SettableFuture settableFuture;
        switch (this.d) {
            case 0:
                wod wodVar = (wod) this.b;
                rwd rwdVar = (rwd) wodVar.c.b();
                rve rveVar = (rve) this.c;
                ((mho) wodVar.b.b()).C(rveVar, rwdVar.s(rveVar), this.a, vqs.a(), amxo.RCS_LEGACY);
                return;
            case 1:
                ((wkk) this.c).k.a(this.a, (aphg) this.b);
                return;
            case 2:
                wod wodVar2 = (wod) this.b;
                rwd rwdVar2 = (rwd) wodVar2.c.b();
                rve rveVar2 = (rve) this.c;
                ((mho) wodVar2.b.b()).B(rveVar2, rwdVar2.s(rveVar2), this.a, amxo.RCS_LEGACY);
                return;
            case 3:
                xxh xxhVar = (xxh) this.c;
                rxq rxqVar = (rxq) xxhVar.e.b();
                int i = this.a;
                if (i != 1) {
                    str = "Failed to update participants' block.";
                } else {
                    str = "Successfully updated participants' block";
                }
                rxqVar.m(i, str);
                ParticipantsTable.BindData a = xxhVar.a((String) this.b);
                if (a != null) {
                    ((rtz) xxhVar.f.b()).P(a.M());
                    return;
                }
                return;
            case 4:
                Predicate predicate = adiq.a;
                Object obj = this.b;
                test = predicate.test(obj);
                albo.T(test);
                aozy createBuilder = apgv.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                apgv apgvVar = (apgv) apagVar;
                apgvVar.f = 9;
                apgvVar.b |= 2;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apgv apgvVar2 = (apgv) createBuilder.b;
                apgvVar2.g = 2;
                apgvVar2.b |= 4;
                aozy createBuilder2 = apgt.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                apgt apgtVar = (apgt) apagVar2;
                apgtVar.c = 1;
                apgtVar.b = 1 | apgtVar.b;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                apgt apgtVar2 = (apgt) apagVar3;
                apgtVar2.h = ((apgs) obj).f;
                apgtVar2.b |= 32;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                int i2 = this.a;
                apgt apgtVar3 = (apgt) createBuilder2.b;
                apgtVar3.b = 2 | apgtVar3.b;
                apgtVar3.d = i2;
                apgt apgtVar4 = (apgt) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.c;
                apgv apgvVar3 = (apgv) createBuilder.b;
                apgtVar4.getClass();
                apgvVar3.d = apgtVar4;
                apgvVar3.c = 12;
                ((adiq) ((ylt) obj2).b).h((apgv) createBuilder.s());
                return;
            case 5:
                ((yck) ((aalt) this.b).V.b()).k(this.a);
                aalt.q((Activity) this.c);
                return;
            case 6:
                ((yck) ((aalt) this.b).V.b()).l(this.a);
                aalt.q((Activity) this.c);
                return;
            case 7:
                Object obj3 = this.c;
                if (this.a != 17) {
                    Object obj4 = this.b;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    acqy.j(sQLiteDatabase, "PresenceContent");
                    acqy.j(sQLiteDatabase, "Subscribers");
                    ((acqy) obj4).onCreate(sQLiteDatabase);
                    return;
                }
                try {
                    ((SQLiteDatabase) obj3).query("Subscribers", new String[]{"isOnline"}, null, null, null, null, null).close();
                    return;
                } catch (SQLiteException unused) {
                    SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj3;
                    sQLiteDatabase2.execSQL("ALTER TABLE Subscribers ADD COLUMN isOnline INTEGER");
                    sQLiteDatabase2.execSQL("ALTER TABLE Subscribers ADD COLUMN responseCode INTEGER");
                    return;
                }
            case 8:
                ((agnf) this.c).a.a(this.a, this.b);
                return;
            case 9:
                cj fe = ((cg) ((ajbd) this.c).d).fe();
                boolean isDestroyed = fe.isDestroyed();
                if (fe != null && !fe.isFinishing() && !isDestroyed) {
                    ((agry) ((ajbd) this.c).d).d = ((aock) this.b.get(this.a)).b;
                    Object obj5 = this.c;
                    int i3 = this.a;
                    agry agryVar = (agry) ((ajbd) obj5).d;
                    agryVar.e = i3;
                    agryVar.ag.b();
                    Log.d("HatsLibMultiChoiceFrag", "User selected response: ".concat(String.valueOf(String.valueOf(this.b.get(this.a)))));
                    ((SurveyPromptActivity) fe).z();
                    agrn.c().b().b = false;
                    return;
                }
                Log.w("HatsLibMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next next page. Likely the user rotated the device before the Runnable executed.");
                return;
            case 10:
                Layout layout = ((TextView) ((ex) this.b).findViewById(R.id.license_activity_textview)).getLayout();
                if (layout != null) {
                    ((ScrollView) this.c).scrollTo(0, layout.getLineTop(layout.getLineForOffset(this.a)));
                    return;
                }
                return;
            case 11:
                int i4 = this.a;
                ?? r1 = this.b;
                ((ajbh) this.c).a.a(new aspl(3, ((apqg) r1.get(i4)).e, ((apqg) r1.get(i4)).d));
                long j = aizr.a;
                return;
            case 12:
                ((BottomSheetBehavior) this.b).Y((View) this.c, this.a, false);
                return;
            case 13:
                ((ajul) this.b).b(this.a, (Bundle) this.c);
                return;
            case 14:
                Object obj6 = this.b;
                akau akauVar = ((akat) this.c).b;
                akauVar.e.remove(obj6);
                while (true) {
                    int i5 = this.a;
                    long j2 = akauVar.c.get();
                    int a2 = akau.a(j2);
                    int b = akau.b(j2);
                    if (b != i5) {
                        synchronized (akauVar.d) {
                            akauVar.g.remove(i5);
                        }
                        return;
                    }
                    if (a2 == 1) {
                        if (akauVar.c.compareAndSet(j2, b)) {
                            synchronized (akauVar.d) {
                                settableFuture = (SettableFuture) akauVar.g.get(b);
                                if (settableFuture == null) {
                                    settableFuture = (SettableFuture) akauVar.f.get(b);
                                    settableFuture.getClass();
                                    akauVar.f.put(b, akau.b);
                                } else {
                                    akauVar.g.remove(b);
                                }
                            }
                            settableFuture.set(null);
                            return;
                        }
                    } else if (a2 > 0) {
                        if (akauVar.c.compareAndSet(j2, akau.c(a2 - 1, j2))) {
                            return;
                        }
                    } else {
                        throw new IllegalStateException(a.bV(a2, "Can't decrement at zero or less refcount: "));
                    }
                }
            case 15:
                int i6 = this.a;
                Object obj7 = this.b;
                Object obj8 = this.c;
                synchronized (((akbd) obj8).b) {
                    akba akbaVar = (akba) ((akbd) obj8).c.remove(obj7);
                    alnn alnnVar = ((akbd) obj8).d;
                    Collection collection = (Collection) ((alla) alnnVar).a.remove(obj7);
                    if (collection == null) {
                        alnnVar.g();
                    } else {
                        Collection a3 = alnnVar.a();
                        a3.addAll(collection);
                        ((alla) alnnVar).b -= collection.size();
                        collection.clear();
                        alnnVar.i(a3);
                    }
                    if (((akbd) obj8).g.ordinal() == 2 && akbaVar == ((akbd) obj8).j) {
                        if (((akbd) obj8).c.isEmpty()) {
                            ((akbd) obj8).d();
                        } else {
                            ((akbd) obj8).f.remove(Integer.valueOf(i6));
                            ((akbd) obj8).e(null);
                        }
                    }
                }
                return;
            case 16:
                anec anecVar = (anec) this.b;
                ListenableFuture[] listenableFutureArr = anecVar.d;
                int i7 = this.a;
                ListenableFuture listenableFuture = listenableFutureArr[i7];
                listenableFuture.getClass();
                listenableFutureArr[i7] = null;
                int i8 = anecVar.e;
                while (true) {
                    Object obj9 = this.c;
                    int i9 = ((alsx) obj9).c;
                    if (i8 < i9) {
                        int i10 = i8 + 1;
                        if (!((ance) ((alog) obj9).get(i8)).m(listenableFuture)) {
                            i8 = i10;
                        } else {
                            anecVar.a();
                            anecVar.e = i10;
                            return;
                        }
                    } else {
                        anecVar.e = i9;
                        return;
                    }
                }
            default:
                try {
                    if (!((aqyc) this.b).c(this.a, (Parcel) this.c)) {
                        aqyc.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    aqyc.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e);
                    return;
                }
        }
    }

    public wob(ajbd ajbdVar, List list, int i, int i2) {
        this.d = i2;
        this.b = list;
        this.a = i;
        this.c = ajbdVar;
    }

    public wob(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.d = i2;
        this.c = view;
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    public /* synthetic */ wob(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ wob(Object obj, int i, Object obj2, int i2, byte[] bArr) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public /* synthetic */ wob(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public /* synthetic */ wob(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
