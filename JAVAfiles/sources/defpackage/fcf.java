package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcf {
    public final Context a;
    public final Handler b;
    public final fcc c;
    public final BroadcastReceiver d;
    public final fcd e;
    public fcb f;
    public epz g;
    public boolean h;
    public efu i;
    private final qdq j;

    public fcf(Context context, qdq qdqVar, epz epzVar, efu efuVar) {
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = qdqVar;
        this.g = epzVar;
        this.i = efuVar;
        Handler D = eul.D();
        this.b = D;
        this.c = new fcc(this);
        this.d = new fce(this);
        if (fcb.b()) {
            uri = Settings.Global.getUriFor("external_surround_sound_enabled");
        } else {
            uri = null;
        }
        this.e = uri != null ? new fcd(this, D, applicationContext.getContentResolver(), uri) : null;
    }

    public final void a(fcb fcbVar) {
        fbe fbeVar;
        String name;
        String name2;
        if (this.h && !fcbVar.equals(this.f)) {
            this.f = fcbVar;
            Object obj = this.j.a;
            Looper myLooper = Looper.myLooper();
            fcx fcxVar = (fcx) obj;
            Looper looper = fcxVar.L;
            if (looper != myLooper) {
                if (looper == null) {
                    name = "null";
                } else {
                    name = looper.getThread().getName();
                }
                if (myLooper == null) {
                    name2 = "null";
                } else {
                    name2 = myLooper.getThread().getName();
                }
                throw new IllegalStateException(a.bZ(name, name2, "Current looper (", ") is not the playback looper (", ")"));
            }
            if (!fcbVar.equals(fcxVar.p)) {
                fcxVar.p = fcbVar;
                qdq qdqVar = fcxVar.W;
                if (qdqVar != null) {
                    Object obj2 = qdqVar.a;
                    synchronized (((ezg) obj2).a) {
                        fbeVar = ((ezg) obj2).i;
                    }
                    if (fbeVar != null) {
                        synchronized (((fjd) fbeVar).b) {
                            boolean z = ((fjd) fbeVar).e.Q;
                        }
                    }
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        Object obj;
        efu efuVar = this.i;
        efu efuVar2 = null;
        if (efuVar == null) {
            obj = null;
        } else {
            obj = efuVar.a;
        }
        if (Objects.equals(audioDeviceInfo, obj)) {
            return;
        }
        if (audioDeviceInfo != null) {
            efuVar2 = new efu(audioDeviceInfo);
        }
        this.i = efuVar2;
        a(fcb.d(this.a, this.g, efuVar2));
    }
}
