package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.util.Log;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahsa implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ahsa(ajef ajefVar, int i) {
        this.b = i;
        this.a = ajefVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        float f;
        int i = 3;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 1:
                Object obj = this.a;
                try {
                    AtomicReference atomicReference = ((ahri) obj).f;
                    ahmn ahmnVar = ((ahri) obj).g;
                    if (((ahrb) ((ahri) obj).d.b()).b()) {
                        f = ((ahrb) ((ahri) obj).d.b()).a;
                    } else {
                        f = 0.0f;
                    }
                    atomicReference.set(ahmnVar.a(f));
                    return;
                } catch (Throwable unused) {
                    ahri ahriVar = (ahri) obj;
                    ahriVar.f.set(ahriVar.g.a(brg.a));
                    return;
                }
            case 2:
                ((ahut) this.a).b();
                return;
            case 3:
                ((ahut) this.a).a();
                return;
            case 4:
                Object obj2 = this.a;
                ahut ahutVar = (ahut) obj2;
                if (ahutVar.c.equals("")) {
                    return;
                }
                ahta ahtaVar = ahutVar.a;
                ListenableFuture b = ahux.b(ahtaVar).b(new abdo(ahutVar.b, 16), ahtaVar.d());
                b.c(new ahnu(obj2, b, 10, bArr), ahutVar.a.d());
                return;
            case 5:
                try {
                    albo.bQ(this.a);
                    return;
                } catch (ExecutionException e) {
                    aiut.e(new ahsa(e, 6));
                    return;
                }
            case 6:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
            case 7:
                if (((Boolean) ((ahva) this.a).a.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 8:
                try {
                    albo.bQ(this.a);
                    return;
                } catch (Exception e2) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e2);
                        return;
                    }
                    return;
                }
            case 9:
                Object obj3 = this.a;
                aiik aiikVar = (aiik) obj3;
                aiiv aiivVar = aiikVar.d;
                if (aiivVar != null) {
                    aiivVar.a = true;
                    try {
                        aiivVar.interrupt();
                    } catch (Exception unused2) {
                    }
                    advr.c("Receiver is terminated", new Object[0]);
                    aiikVar.d = null;
                }
                try {
                    ((aiik) obj3).h.G();
                    advr.c("Connection has been closed", new Object[0]);
                    return;
                } catch (Exception e3) {
                    try {
                        advr.i(e3, "Couldn't close socket correctly", new Object[0]);
                        return;
                    } catch (Exception e4) {
                        advr.i(e4, "Couldn't close socket correctly", new Object[0]);
                        return;
                    }
                }
            case 10:
                ((airc) this.a).b(aodc.EXPLICIT_SEARCH_TEXT);
                return;
            case 11:
                ((airc) this.a).b(aodc.IMPLICIT_SEARCH_TEXT);
                return;
            case 12:
                Object obj4 = this.a;
                ajgi ajgiVar = new ajgi((Context) obj4);
                ajgiVar.x(R.string.stickers_no_connection_alert_title);
                ajgiVar.m(R.string.stickers_no_connection_alert_message);
                ajgiVar.t(R.string.stickers_error_alert_ok, new aajo(obj4, 18));
                ajgiVar.r(new aatr(obj4, i));
                ajgiVar.create().show();
                return;
            case 13:
                Object obj5 = this.a;
                synchronized (((aixj) obj5).h) {
                    if (((aixj) obj5).k == 0) {
                        ((aixj) obj5).d();
                    }
                }
                return;
            case 14:
                ?? r0 = this.a;
                aixj aixjVar = (aixj) r0;
                synchronized (aixjVar.h) {
                    ListenableFuture listenableFuture = ((aixj) r0).j;
                    if (((aixj) r0).k == 0 && listenableFuture != null) {
                        ((aixj) r0).j = null;
                        if (!listenableFuture.cancel(true)) {
                            try {
                                ((SQLiteDatabase) albo.bQ(listenableFuture)).close();
                            } catch (ExecutionException unused3) {
                            }
                        }
                        aixjVar.b.unregisterComponentCallbacks(r0);
                        Iterator it = aixjVar.g.iterator();
                        while (it.hasNext()) {
                            if (((WeakReference) it.next()).get() == null) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                }
            case 15:
                ((aiyc) this.a).b();
                return;
            case 16:
                EditText editText = (EditText) this.a;
                editText.setFocusable(true);
                editText.setFocusableInTouchMode(true);
                return;
            case 17:
                ajax ajaxVar = (ajax) this.a;
                ajaw ajawVar = ajaxVar.a;
                if (ajawVar != null) {
                    ajawVar.a(1);
                    ajaxVar.a = null;
                    return;
                }
                return;
            case 18:
                ajax ajaxVar2 = (ajax) this.a;
                ajaw ajawVar2 = ajaxVar2.a;
                if (ajawVar2 != null) {
                    ajawVar2.a(2);
                    ajaxVar2.a = null;
                    return;
                }
                return;
            case 19:
                ajbl ajblVar = (ajbl) this.a;
                ajblVar.j = true;
                ajblVar.u.finish();
                return;
            default:
                ajef ajefVar = (ajef) this.a;
                ajefVar.b = false;
                ehk ehkVar = ajefVar.c.x;
                if (ehkVar != null && ehkVar.l()) {
                    ajef ajefVar2 = (ajef) this.a;
                    ajefVar2.a(ajefVar2.a);
                    return;
                }
                ajef ajefVar3 = (ajef) this.a;
                BottomSheetBehavior bottomSheetBehavior = ajefVar3.c;
                if (bottomSheetBehavior.w == 2) {
                    bottomSheetBehavior.W(ajefVar3.a);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ahsa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
