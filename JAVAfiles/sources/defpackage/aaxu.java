package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.SignInCoordinator;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaxu implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaxu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = null;
        switch (this.b) {
            case 0:
                aaxz aaxzVar = (aaxz) this.a;
                aaxzVar.f.h("boew_promo_complete", true);
                aaxzVar.m(wfo.GOOGLE_TOS_CONSENTED);
                ((adnk) aaxzVar.k.b()).G();
                aaxzVar.j.i(amww.COMPLETE_GOOGLE_TOS);
                return;
            case 1:
                ((aawo) ((aaxd) this.a).F).E().h();
                return;
            case 2:
                Object obj = this.a;
                aaxz aaxzVar2 = (aaxz) obj;
                aaxzVar2.n(whk.LEGAL_FYI_SEEN);
                if (((okr) aaxzVar2.q.b()).a() && aczv.x() && aczv.X()) {
                    ((wwn) aaxzVar2.n.b()).c().h(new aald(obj, 7), aaxzVar2.m).k(qiu.b(), andi.a);
                    return;
                } else {
                    aaxzVar2.j.i(amww.LEGAL_FYI_SEEN);
                    return;
                }
            case 3:
                ((mho) ((aayo) this.a).a.b()).S(amlw.RCS_PROVISIONING_PROMPT_SEEN, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
                return;
            case 4:
                aayo aayoVar = (aayo) this.a;
                ((mho) aayoVar.a.b()).S(amlw.RCS_PROVISIONING_PROMPT_DECLINED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
                ykw ykwVar = (ykw) aayoVar.e.b();
                ykwVar.h("boew_promo_complete", true);
                ykwVar.h("should_show_rcs_promo", false);
                ((mho) aayoVar.a.b()).x();
                return;
            case 5:
                aazd aazdVar = (aazd) this.a;
                aazdVar.b.startAnimation(AnimationUtils.makeInChildBottomAnimation(aazdVar.b.getContext()));
                aazdVar.b.setVisibility(0);
                return;
            case 6:
                ((aaxz) this.a).e();
                return;
            case 7:
                ((Toast) this.a).show();
                return;
            case 8:
                abbt abbtVar = (abbt) this.a;
                View view = abbtVar.g;
                if (view != null) {
                    Object context = view.getContext();
                    while (true) {
                        if (!(context instanceof Activity)) {
                            if (context instanceof ContextWrapper) {
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        } else {
                            activity = (Activity) context;
                        }
                    }
                }
                if (activity != null && !activity.isFinishing()) {
                    abbtVar.d();
                    abbtVar.f();
                    abbtVar.b.showAtLocation(abbtVar.g, 0, abbtVar.a(), abbtVar.b());
                    return;
                }
                return;
            case 9:
                ((abda) this.a).a.f(true);
                return;
            case 10:
                ((abda) this.a).a.f(false);
                return;
            case 11:
                Object obj2 = this.a;
                aboj abojVar = (aboj) obj2;
                abojVar.d.writeLock().lock();
                try {
                    ((aboj) obj2).f = null;
                    abojVar.d.writeLock().unlock();
                    abojVar.f();
                    return;
                } catch (Throwable th) {
                    abojVar.d.writeLock().unlock();
                    throw th;
                }
            case 12:
                Object obj3 = this.a;
                while (true) {
                    synchronized (obj3) {
                        if (((abpf) obj3).a != 2) {
                            return;
                        }
                        if (((abpf) obj3).c.isEmpty()) {
                            ((abpf) obj3).d();
                            return;
                        }
                        abph abphVar = (abph) ((abpf) obj3).c.poll();
                        ((abpf) obj3).d.put(abphVar.a, abphVar);
                        ((abpf) obj3).e.c.schedule(new aanh(obj3, abphVar, 15), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(String.valueOf(abphVar))));
                        }
                        abpf abpfVar = (abpf) obj3;
                        aixx aixxVar = abpfVar.e;
                        Messenger messenger = abpfVar.b;
                        int i = abphVar.c;
                        Message obtain = Message.obtain();
                        obtain.what = i;
                        obtain.arg1 = abphVar.a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", abphVar.b());
                        bundle.putString("pkg", ((Context) aixxVar.b).getPackageName());
                        bundle.putBundle(GroupManagementRequest.DATA_TAG, abphVar.d);
                        obtain.setData(bundle);
                        try {
                            znp znpVar = ((abpf) obj3).f;
                            Object obj4 = znpVar.a;
                            if (obj4 != null) {
                                ((Messenger) obj4).send(obtain);
                            } else {
                                Object obj5 = znpVar.b;
                                if (obj5 != null) {
                                    ((CloudMessagingMessengerCompat) obj5).b(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                    break;
                                }
                            }
                        } catch (RemoteException e) {
                            abpfVar.g(e.getMessage());
                        }
                    }
                }
            case 13:
                ((abpf) this.a).b();
                return;
            case 14:
                ((abpf) this.a).g("Service disconnected");
                return;
            case 15:
                if (((acit) this.a).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 16:
                ((absl) this.a).f();
                return;
            case 17:
                abqz abqzVar = ((absl) ((ahjj) this.a).a).b;
                abqzVar.g(String.valueOf(abqzVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case 18:
                abtb abtbVar = (abtb) this.a;
                abtbVar.c = false;
                abtbVar.b = null;
                abtbVar.c();
                abtbVar.a.onConnectionSuspended(1);
                return;
            case 19:
                SignInCoordinator.m202$$Nest$fgetmCallback((SignInCoordinator) this.a).b(new ConnectionResult(4));
                return;
            default:
                Object obj6 = this.a;
                abwb abwbVar = (abwb) obj6;
                if (abwbVar.b == null) {
                    return;
                }
                try {
                    ((abwb) obj6).b.close();
                } catch (Exception unused) {
                    Log.e("DGHandleImpl", "Error while closing handle.");
                }
                abwbVar.b = null;
                r0.a--;
                abwbVar.a.c();
                return;
        }
    }

    public aaxu(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
