package defpackage;

import android.util.Log;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ktn implements acil {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ktn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.acil
    public final void d(Exception exc) {
        Optional empty;
        Optional optional;
        int i;
        int i2 = 2;
        boolean z = true;
        switch (this.b) {
            case 0:
                this.a.run();
                return;
            case 1:
                ((jvf) this.a).a(exc);
                return;
            case 2:
                alvw i3 = uyc.a.i();
                i3.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) ((alvg) i3).g(exc);
                alvgVar.X(ydl.M, "TrustedContactsSyncManager");
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/kids/sync/TrustedContactsSyncManager$registerListener$1", "invokeSuspend$lambda$1", 96, "TrustedContactsSyncManager.kt")).q("Failed to register the listener.");
                uyc uycVar = (uyc) this.a;
                ((mbl) uycVar.g.b()).c("Bugle.Kids.AllowlistUpdate.Listener.FailedToBeRegistered");
                if (!((Boolean) uycVar.j.b()).booleanValue()) {
                    return;
                } else {
                    throw new IllegalStateException("Failed to register listener on a standalone device.", exc);
                }
            case 3:
                yby.a.r("Constellation returned unexpected exception, returning empty list.", exc);
                int i4 = alog.d;
                ((dtq) this.a).b(alsx.a);
                return;
            case 4:
                ((alvg) ((alvg) ((alvg) aaue.a.i()).g(exc)).h("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerPresenter", "startListeningForCurrentLocation", (char) 186, "LocationAttachmentPickerPresenter.java")).q("Failed to get the current location");
                ((aaue) this.a).b();
                return;
            case 5:
                alwo alwoVar = abeu.a;
                if (exc instanceof abra) {
                    Object obj = this.a;
                    alwl alwlVar = (alwl) ((alwl) abeu.a.i()).g(exc);
                    alwlVar.X(ydl.M, "SyncDataToWearableAppHandler");
                    alwlVar.X(ydl.p, obj);
                    alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "executeDataClientRequest", 562, "SyncDataToWearableAppHandler.java");
                    abra abraVar = (abra) exc;
                    alwlVar2.D("Failed to sync conversation to data client with ApiException[status=%s, connectionResult=%s]", abeu.k(abraVar), abeu.j(abraVar));
                    return;
                }
                return;
            case 6:
                ((abxd) this.a).b.h(15);
                return;
            case 7:
                ((abxd) this.a).b.h(15);
                return;
            case 8:
                ((abxg) this.a).a.h(14);
                return;
            case 9:
                ((abxg) this.a).a.h(14);
                return;
            case 10:
                ((acit) this.a).c(exc);
                return;
            case 11:
                adln adlnVar = (adln) this.a;
                adlnVar.a.D.e("UPI - verifyPhoneNumber API returned an exception: %s", exc.getMessage());
                Optional empty2 = Optional.empty();
                if (((Boolean) adkh.a.a()).booleanValue()) {
                    empty = Optional.of(((aday) adlnVar.a.O.b()).k(adlnVar.a.n));
                } else {
                    empty = Optional.empty();
                }
                Optional optional2 = empty;
                if (exc instanceof abra) {
                    int a = ((abra) exc).a();
                    Optional of = Optional.of(Integer.valueOf(a));
                    if (a != 7 && a != 8 && a != 20 && a != 5002) {
                        z = false;
                    }
                    optional = of;
                    i = 6;
                } else {
                    if (!(exc instanceof adma)) {
                        if (exc instanceof admb) {
                            i2 = 3;
                        } else {
                            optional = empty2;
                            i = 7;
                            z = false;
                        }
                    }
                    optional = empty2;
                    i = i2;
                    z = false;
                }
                adlw adlwVar = adlnVar.a;
                String str = adlwVar.r;
                String r = adlnVar.r();
                String u = adlnVar.a.u();
                String q = adlnVar.q();
                adlw adlwVar2 = adlnVar.a;
                adlwVar.aE.o(adlwVar.s, str, r, u, q, i, z, optional, aczv.d(), adlwVar2.z.a(adlwVar2.n), new adiw(adlnVar.a.n), Optional.empty(), optional2);
                if (z) {
                    adlnVar.t();
                    return;
                } else {
                    adlnVar.s(false);
                    return;
                }
            case 12:
                boolean z2 = agls.a;
                Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
                return;
            default:
                boolean z3 = agls.a;
                Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
                return;
        }
    }
}
