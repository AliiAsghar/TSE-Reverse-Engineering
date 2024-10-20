package defpackage;

import android.media.MediaRecorder;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import j$.time.Duration;
import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqm implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener, agih {
    private static final alvi g = alvi.m("com/google/android/apps/messaging/conversation/input/compose/voice/VoiceRecordingController");
    public final ascv a;
    public final asai b;
    public final ascv c;
    public final ascv d;
    public final ascv e;
    public final ahiy f;
    private final ngv h;
    private final arwe i;
    private final xnv j;
    private final rtb k;
    private final ngw l;
    private final abbu m;
    private final mcu n;
    private final mcx o;
    private final inn p;
    private final Supplier q;
    private Instant r;
    private final ascd s;
    private final ascd t;
    private final ascd u;

    /* JADX WARN: Type inference failed for: r1v2, types: [asai, java.lang.Object] */
    public iqm(ngv ngvVar, arwe arweVar, ahiy ahiyVar, xnv xnvVar, rtb rtbVar, ngw ngwVar, abbu abbuVar, mcu mcuVar, mcx mcxVar, inn innVar, Supplier supplier) {
        this.h = ngvVar;
        this.i = arweVar;
        this.f = ahiyVar;
        this.j = xnvVar;
        this.k = rtbVar;
        this.l = ngwVar;
        this.m = abbuVar;
        this.n = mcuVar;
        this.o = mcxVar;
        this.p = innVar;
        this.q = supplier;
        ascd a = ascy.a(agiq.b);
        this.s = a;
        ascd a2 = ascy.a(null);
        this.t = a2;
        ascd a3 = ascy.a(null);
        this.u = a3;
        this.a = new ascf(a);
        this.b = ngvVar.d.a;
        this.c = ngwVar.d;
        this.d = new ascf(a2);
        this.e = new ascf(a3);
    }

    private final Duration e() {
        return Duration.between(this.r, this.j.f());
    }

    private final void f() {
        this.l.a();
        if (this.h.d()) {
            this.n.b(e().toSeconds(), 6, amue.NOISE_CANCELLATION_STATE_UNKNOWN);
            Uri b = this.h.b();
            if (b != null) {
                qjh.l(this.i, null, new gbv(this, b, (arpe) null, 15), 3);
            }
        }
        i();
    }

    private final void g() {
        Object obj;
        String str;
        k();
        aftn aftnVar = (aftn) this.u.c();
        if (aftnVar != null) {
            obj = this.q.get();
            inq inqVar = (inq) obj;
            rtb rtbVar = this.k;
            Uri parse = Uri.parse(aftnVar.b);
            rtc a = rtd.a();
            if (true != ((Boolean) nhr.a.e()).booleanValue()) {
                str = "audio/amr";
            } else {
                str = "audio/mp4";
            }
            a.c = str;
            a.d = parse;
            a.e = parse;
            a.c(aftnVar.e.toMillis());
            a.k(ameb.AUDIO_CHOOSER);
            MessagePartData e = rtbVar.e(a.a());
            e.f = aauk.b(e, (aauj) iqn.a.a());
            inqVar.c(e);
        }
        h();
        i();
    }

    private final void h() {
        inn innVar = this.p;
        if (innVar.c() == ins.VOICE) {
            innVar.h(false);
        }
    }

    private final void i() {
        this.r = null;
        this.s.f(agiq.b);
        this.t.f(null);
        this.u.f(null);
    }

    private final void j(int i) {
        this.t.f(Integer.valueOf(i));
    }

    private final void k() {
        afrs afrsVar;
        this.l.a();
        if (this.h.d()) {
            this.n.c(e().toSeconds(), 6, amue.NOISE_CANCELLATION_STATE_UNKNOWN);
            Uri b = this.h.b();
            if (b != null) {
                ascd ascdVar = this.u;
                if (((Boolean) nhr.a.e()).booleanValue()) {
                    afrsVar = afrl.a;
                } else {
                    afrsVar = afrk.a;
                }
                String uri = b.toString();
                uri.getClass();
                Instant now = Instant.now();
                now.getClass();
                aggr aggrVar = aggr.a;
                Duration e = e();
                e.getClass();
                ascdVar.f(new aftn(afrsVar, uri, null, null, 0L, now, aggrVar, e, null, 268));
                this.s.f(agir.c);
            }
        }
    }

    @Override // defpackage.agih
    public final void a(boolean z, boolean z2, aggp aggpVar) {
        if (z) {
            g();
            return;
        }
        f();
        if (z2) {
            h();
        }
    }

    @Override // defpackage.agih
    public final void b() {
        Object obj;
        i();
        this.r = this.j.f();
        obj = this.q.get();
        if (!this.h.e(this, this, (int) ((Number) ((inq) obj).e().b.a()).longValue())) {
            j(R.string.audio_recording_start_failed);
        } else {
            this.s.f(agir.b);
        }
        ngw ngwVar = this.l;
        ngwVar.c = qjh.l(ngwVar.a, null, new mwv(ngwVar, (arpe) null, 7), 3);
    }

    @Override // defpackage.agih
    public final void c() {
        k();
    }

    @Override // defpackage.agih
    public final void d(aggp aggpVar) {
        g();
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        alvw h = g.h();
        h.X(alwp.a, "Bugle");
        ((alvg) h.h("com/google/android/apps/messaging/conversation/input/compose/voice/VoiceRecordingController", "onError", 225, "VoiceRecordingController.kt")).u("Error occurred during audio recording what=%s, extra=%s", i, i2);
        this.o.b(6);
        f();
        j(R.string.audio_recording_error);
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        if (i != 800) {
            if (i != 801) {
                return;
            }
            alvw g2 = g.g();
            g2.X(alwp.a, "Bugle");
            ((alvg) g2.h("com/google/android/apps/messaging/conversation/input/compose/voice/VoiceRecordingController", "onInfo", 239, "VoiceRecordingController.kt")).q("Max size reached while recording audio");
            k();
            return;
        }
        alvw g3 = g.g();
        g3.X(alwp.a, "Bugle");
        ((alvg) g3.h("com/google/android/apps/messaging/conversation/input/compose/voice/VoiceRecordingController", "onInfo", 234, "VoiceRecordingController.kt")).q("Max duration reached while recording audio");
        this.m.k(R.string.audio_recorder_time_limit_reached_text);
        k();
    }
}
