package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.ims.service.JibeService;
import j$.util.Optional;
import java.io.File;
import java.lang.Thread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adub implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ adub(aohs aohsVar, akfb akfbVar, akgh akghVar, int i) {
        this.d = i;
        this.c = aohsVar;
        this.a = akfbVar;
        this.b = akghVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v156, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [akgh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, akfb] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Optional empty;
        byte[] bArr = null;
        int i = 0;
        switch (this.d) {
            case 0:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ((JibeService) this.a).c;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException((Thread) this.b, (Throwable) this.c);
                    return;
                }
                return;
            case 1:
                adms admsVar = (adms) this.c;
                boolean booleanValue = ((Boolean) admsVar.i.b()).booleanValue();
                Object obj = this.a;
                ?? r6 = this.b;
                if (booleanValue) {
                    wxb wxbVar = (wxb) obj;
                    advr.r(adms.a, "Called attemptPhoneNumberBackillAndAddToIdentityMapping for sub id: %s and simGuid: %s", Integer.valueOf(wxbVar.d), wxbVar.p);
                    vbg vbgVar = (vbg) admsVar.k.b();
                    int i2 = wxbVar.d;
                    msh a = vbgVar.a(i2);
                    if (a == null) {
                        ((alvg) vbg.a.i().h("com/google/android/apps/messaging/shared/net/MsisdnFromSimHelper", "getFormattedE164PhoneNumberFromMessagingIdentity", 35, "MsisdnFromSimHelper.kt")).t("Messaging Identity not found for %s", advq.SUBSCRIPTION_ID.c(Integer.valueOf(i2)));
                        empty = Optional.empty();
                    } else {
                        Optional d = a.d(false);
                        d.getClass();
                        String str = (String) arsd.k(d);
                        if (str == null) {
                            ((alvg) vbg.a.i().h("com/google/android/apps/messaging/shared/net/MsisdnFromSimHelper", "getFormattedE164PhoneNumberFromMessagingIdentity", 44, "MsisdnFromSimHelper.kt")).t("Phone number not found for %s", advq.SUBSCRIPTION_ID.c(Integer.valueOf(i2)));
                            empty = Optional.empty();
                        } else {
                            try {
                                empty = Optional.of(((adae) vbgVar.b.b()).d(str));
                            } catch (IllegalStateException unused) {
                                ((alvg) vbg.a.i().h("com/google/android/apps/messaging/shared/net/MsisdnFromSimHelper", "getFormattedE164PhoneNumberFromMessagingIdentity", 51, "MsisdnFromSimHelper.kt")).q("Phone number is not in canonical format.");
                                empty = Optional.empty();
                            }
                        }
                    }
                    adit aditVar = (adit) empty.orElse(null);
                    if (aditVar == null && !admsVar.g.b(wxbVar.d)) {
                        advr.r(adms.a, "Backfill of phone number failed for sub id: %s and simGuid: %s", Integer.valueOf(wxbVar.d), wxbVar.p);
                    }
                    admsVar.e.m(r6, aditVar, wxbVar.d);
                    return;
                }
                wxb wxbVar2 = (wxb) obj;
                if (!admsVar.g.b(wxbVar2.d)) {
                    advr.l(adms.a, "Called addIdentityMappingWithoutPhoneNumberIfSingleRegistration and isSingleRegistration is false for sub id: %s and simId %s", Integer.valueOf(wxbVar2.d), advq.SIM_ID.c(wxbVar2.c));
                    return;
                } else {
                    admsVar.e.m(r6, null, wxbVar2.d);
                    return;
                }
            case 2:
                int i3 = agqa.a;
                if (((AtomicBoolean) this.c).compareAndSet(false, true)) {
                    ((Context) this.b).unregisterReceiver((BroadcastReceiver) this.a);
                    return;
                }
                return;
            case 3:
                ((ahjv) ((ahiy) this.a).b).d((File) this.b, (String) this.c);
                return;
            case 4:
                ahrr.b(new ahnu(this.a, this.b, 6, bArr), this.c);
                return;
            case 5:
                Object obj2 = this.a;
                Object obj3 = this.c;
                try {
                    try {
                        albo.bQ(this.b);
                        Log.i("PhenotypeBackgroundRecv", a.cp((String) obj3, "Successfully updated snapshot for "));
                    } finally {
                        ((BroadcastReceiver.PendingResult) obj2).finish();
                    }
                } catch (ExecutionException e) {
                    Log.w("PhenotypeBackgroundRecv", a.cp((String) obj3, "Failed to update local snapshot for "), e);
                }
                return;
            case 6:
                ((aizi) this.b).j((aqjf) this.c, (aoij) this.a);
                return;
            case 7:
                ((aizi) this.a).h((apqe) this.c, (asgf) this.b);
                return;
            case 8:
                ((ajul) this.b).c((String) this.c, (Bundle) this.a);
                return;
            case 9:
                akat.b(this.a, (String) this.b, (Object[]) this.c);
                return;
            case 10:
                akbs akbsVar = (akbs) this.a;
                boolean z = akbsVar.e;
                Object obj4 = this.c;
                if (z) {
                    Object obj5 = this.b;
                    if (akbsVar.c.remove(obj5)) {
                        akbp akbpVar = (akbp) akbsVar.b.b(((akbu) obj5).a);
                        akrh f = aktp.f("onSuccess FuturesMixin", akrk.a);
                        try {
                            akbpVar.c(((akbu) obj5).d, obj4);
                            f.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 11:
                akbs akbsVar2 = (akbs) this.a;
                boolean z2 = akbsVar2.e;
                Object obj6 = this.c;
                if (z2) {
                    Object obj7 = this.b;
                    if (akbsVar2.c.remove(obj7)) {
                        akbp akbpVar2 = (akbp) akbsVar2.b.b(((akbu) obj7).a);
                        akrh f2 = aktp.f("onFailure FuturesMixin", akrk.a);
                        try {
                            akbpVar2.a(((akbu) obj7).d, (Throwable) obj6);
                            f2.close();
                            return;
                        } catch (Throwable th3) {
                            try {
                                f2.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            case 12:
                Object obj8 = this.b;
                Object obj9 = this.c;
                if (obj9 != null) {
                    ((ansy) obj8).b.remove(obj9);
                }
                ((ahiy) ((ansy) obj8).a).q(albo.bI(null), ((akft) this.a).b);
                return;
            case 13:
                ((akgl) ((aohs) this.c).a).a(this.a, new akff(), this.b);
                return;
            case 14:
                Object obj10 = this.a;
                Object obj11 = this.b;
                Object obj12 = this.c;
                ((akgn) obj12).b.execute(new adub(obj12, obj11, obj10, 15, (byte[]) null));
                return;
            case 15:
                aiut.c();
                Object obj13 = this.b;
                Object obj14 = this.c;
                akgn akgnVar = (akgn) obj14;
                albo.U(!obj13.equals(akgnVar.f), "The same LoadTask was processed twice.");
                Object obj15 = this.a;
                akfq akfqVar = (akfq) obj15;
                albo.T(akfqVar.b().isDone());
                if (akgnVar.k.h(obj15) && !akfqVar.b().isCancelled()) {
                    try {
                        try {
                            if (((akgf) obj13).b(((akgn) obj14).f)) {
                                ((akfq) obj15).c();
                            } else if (!((akfq) obj15).b().isCancelled()) {
                                int a2 = ((akgn) obj14).g.c.a(((akgf) obj13).f, ((akfq) obj15).a(), !((akgf) obj13).c()) - 1;
                                if (a2 != 0) {
                                    if (a2 != 1) {
                                        ((akgn) obj14).b((akgf) obj13, (akfq) obj15);
                                        if (((akgf) obj13).c()) {
                                            akfo akfoVar = new akfo();
                                            akfoVar.addSuppressed(aktu.c());
                                            ((akgn) obj14).h(akfoVar);
                                        } else {
                                            ((akgn) obj14).d((akgf) obj13);
                                        }
                                    } else {
                                        ((akgn) obj14).b((akgf) obj13, (akfq) obj15);
                                        if (((akgn) obj14).h.d && ((akgn) obj14).i()) {
                                            albo.U(((akgn) obj14).h.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                            akgn.g((akey) ((akgn) obj14).h.c);
                                            ((akgn) obj14).h = ((akgn) obj14).h.b(false);
                                        }
                                    }
                                } else {
                                    ((akfq) obj15).c();
                                    if (((akgf) obj13).c()) {
                                        akfo akfoVar2 = new akfo();
                                        akfoVar2.addSuppressed(aktu.c());
                                        ((akgn) obj14).h(akfoVar2);
                                    } else {
                                        ((akgn) obj14).d((akgf) obj13);
                                    }
                                }
                            }
                            if (((akgn) obj14).h.d && ((akgn) obj14).i()) {
                                albo.U(((akgn) obj14).h.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                akgn.g((akey) ((akgn) obj14).h.c);
                                ((akgn) obj14).h = ((akgn) obj14).h.b(false);
                                return;
                            }
                            return;
                        } catch (Throwable th5) {
                            akgnVar.c.execute(new ajir(th5, 20, bArr));
                            return;
                        }
                    } catch (akgj e2) {
                        ((akgn) obj14).h(e2.getCause());
                        return;
                    }
                }
                return;
            case 16:
                Object obj16 = this.a;
                Object obj17 = this.b;
                Object obj18 = this.c;
                ((akgn) obj18).b.execute(new adub(obj18, obj17, obj16, 17, (byte[]) null));
                return;
            case 17:
                Object obj19 = this.a;
                Object obj20 = this.c;
                akgn akgnVar2 = (akgn) obj20;
                apuv apuvVar = akgnVar2.j;
                Object obj21 = this.b;
                if (apuvVar.h(obj19) && !((ahlp) obj19).a.isCancelled()) {
                    aiut.c();
                    try {
                        try {
                            albo.bQ(((ahlp) obj19).a);
                            if ((((akgf) obj21).a.c() instanceof akfs) && ((akgf) obj21).b(((akgn) obj20).f)) {
                                ((akgn) obj20).i.p(albo.bI(null), ((akgf) obj21).a.c(), akfy.a, alfd.a, ((akgn) obj20).b);
                                return;
                            }
                            if (((akgf) obj21).b(((akgn) obj20).f)) {
                                if (((akgn) obj20).h.d && ((akgn) obj20).i()) {
                                    albo.U(((akgn) obj20).h.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                    akgn.g((akey) ((akgn) obj20).h.c);
                                    ((akgn) obj20).h = ((akgn) obj20).h.b(false);
                                    return;
                                }
                                return;
                            }
                            ((akgn) obj20).e((akgf) obj21);
                            ((akgn) obj20).i.p(albo.bI(null), ((akgf) obj21).a.c(), akfy.a, algw.i(((akgn) obj20).d), ((akgn) obj20).b);
                            return;
                        } catch (ExecutionException e3) {
                            ((akgn) obj20).h(e3.getCause());
                            return;
                        }
                    } catch (Throwable th6) {
                        akgnVar2.c.execute(new ajir(th6, 19, bArr));
                        return;
                    }
                }
                return;
            case 18:
                ((aknm) this.a).b((apsd) this.b, (aqut) this.c);
                return;
            case 19:
                ((akos) this.a).l((akot) this.b, this.c);
                return;
            default:
                ((aofp) this.a).a.execute(new aofk(this.c, this.b, i, bArr));
                return;
        }
    }

    public /* synthetic */ adub(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ adub(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ adub(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ adub(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
