package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvw implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener, kkl {
    public static final /* synthetic */ int m = 0;
    private static final alvi n = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController");
    public final arwe a;
    public final Context b;
    public final abbu c;
    public final nid d;
    public final armf e;
    public final armf f;
    public final Optional g;
    public final armf h;
    public final ascv i;
    public int j;
    public final zfm k;
    public final ahiy l;
    private final ngv o;
    private final arwe p;
    private final ngw q;
    private final ascg r;
    private final armf s;
    private final mcu t;
    private final mcx u;
    private final ascd v;
    private final ascd w;
    private final ascd x;
    private final arml y;
    private final arml z;

    public jvw(ngv ngvVar, arwe arweVar, arwe arweVar2, Context context, ahiy ahiyVar, xnv xnvVar, ngw ngwVar, abbu abbuVar, ascg ascgVar, afku afkuVar, armf armfVar, ygv ygvVar, nid nidVar, @nif armf armfVar2, armf armfVar3, armf armfVar4, mcu mcuVar, mcx mcxVar, armf armfVar5, Optional optional, armf armfVar6, @nic armf armfVar7, zfm zfmVar) {
        ngvVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        context.getClass();
        ahiyVar.getClass();
        xnvVar.getClass();
        ngwVar.getClass();
        abbuVar.getClass();
        ascgVar.getClass();
        afkuVar.getClass();
        armfVar.getClass();
        ygvVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        mcuVar.getClass();
        mcxVar.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        zfmVar.getClass();
        this.o = ngvVar;
        this.p = arweVar;
        this.a = arweVar2;
        this.b = context;
        this.l = ahiyVar;
        this.q = ngwVar;
        this.c = abbuVar;
        this.r = ascgVar;
        this.s = armfVar;
        this.d = nidVar;
        this.e = armfVar3;
        this.f = armfVar4;
        this.t = mcuVar;
        this.u = mcxVar;
        this.g = optional;
        this.h = armfVar7;
        this.k = zfmVar;
        this.v = ascy.a(agiq.b);
        this.w = ascy.a(null);
        this.x = ascy.a(null);
        this.j = 1;
        this.y = armd.a(new juf(this, 5));
        jtf jtfVar = new jtf(new jtf(ascgVar, 12), 13);
        int i = ascp.a;
        this.i = arrn.T(jtfVar, arweVar2, asco.a, false);
        this.z = armd.a(new juf(this, 4));
    }

    private final amue j() {
        return (amue) this.g.map(new ivi(jld.t, 16)).orElse(amue.NOISE_CANCELLATION_STATE_UNKNOWN);
    }

    private final Duration k() {
        return a().b();
    }

    public final aghp a() {
        return (aghp) this.y.a();
    }

    public final agip b() {
        return (agip) this.z.a();
    }

    public final void c() {
        if (i()) {
            ((jhj) this.s.b()).b(null);
        }
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        qjh.l(this.p, null, new jpc(this, (arpe) null, 15), 3);
    }

    public final void d(Duration duration) {
        this.t.b(duration.toSeconds(), this.j, j());
    }

    public final void e(Exception exc) {
        exc.getClass();
        this.u.b(this.j);
    }

    public final void f(Duration duration) {
        this.t.c(duration.toSeconds(), this.j, j());
    }

    public final void g() {
        ((jhj) this.s.b()).b(jhf.a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ascg] */
    public final void h() {
        afrs afrsVar;
        this.q.a();
        if (this.o.d()) {
            f(k());
            List d = this.o.d.a.d();
            ArrayList arrayList = new ArrayList(aqjn.J(d, 10));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((aggs) it.next()).a));
            }
            Uri b = this.o.b();
            if (b != null) {
                ascd ascdVar = this.x;
                if (((Boolean) nhr.a.e()).booleanValue()) {
                    afrsVar = afrl.a;
                } else {
                    afrsVar = afrk.a;
                }
                String uri = b.toString();
                uri.getClass();
                Instant now = Instant.now();
                now.getClass();
                ascdVar.f(new aftn(afrsVar, uri, null, null, 0L, now, aggr.a, k(), null, 268));
                this.v.f(agir.c);
            }
        }
    }

    public final boolean i() {
        agfk agfkVar;
        agfn a = ((jhj) this.s.b()).a();
        agek agekVar = null;
        if (a instanceof agfk) {
            agfkVar = (agfk) a;
        } else {
            agfkVar = null;
        }
        if (agfkVar != null) {
            agekVar = agfkVar.a.a;
        }
        if (agekVar == agek.g) {
            return true;
        }
        return false;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        alvw h = n.h();
        h.X(alwp.a, "BugleComposeRow2");
        ((alvg) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onError", 279, "VoiceRecordingController.kt")).u("Error occurred during audio recording what=%s, extra=%s", i, i2);
        e(new Exception(a.bU(i2, i, "MediaRecorder error what=", ", extra=")));
        this.q.a();
        if (this.o.d()) {
            d(k());
            Uri b = this.o.b();
            if (b != null) {
                qjh.l(this.p, null, new jvr(this, b, (arpe) null, 4), 3);
            }
        }
        this.v.f(agiq.b);
        this.w.f(null);
        this.x.f(null);
        this.w.f(Integer.valueOf(R.string.audio_recording_error));
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        if (i != 800) {
            if (i != 801) {
                return;
            }
            alvw g = n.g();
            g.X(alwp.a, "BugleComposeRow2");
            ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onInfo", 293, "VoiceRecordingController.kt")).q("Max size reached while recording audio");
            h();
            return;
        }
        alvw g2 = n.g();
        g2.X(alwp.a, "BugleComposeRow2");
        ((alvg) g2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onInfo", 288, "VoiceRecordingController.kt")).q("Max duration reached while recording audio");
        this.c.k(R.string.audio_recorder_time_limit_reached_text);
        h();
    }
}
