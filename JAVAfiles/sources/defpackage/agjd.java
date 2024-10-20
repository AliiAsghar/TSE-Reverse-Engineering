package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agjd implements agig {
    final /* synthetic */ agje a;

    public agjd(agje agjeVar) {
        this.a = agjeVar;
    }

    @Override // defpackage.agig
    public final void a() {
        this.a.b.a();
    }

    @Override // defpackage.agig
    public final void b() {
        this.a.b.b();
    }

    @Override // defpackage.agig
    public final void c(float f) {
        this.a.d.f(Float.valueOf(f));
        if (((Boolean) ((aggk) this.a.b).f.c()).booleanValue()) {
            this.a.b.a();
            this.a.e = true;
        }
    }

    @Override // defpackage.agig
    public final void d() {
        Float f = (Float) this.a.d.c();
        if (f != null) {
            agje agjeVar = this.a;
            float floatValue = f.floatValue();
            if (floatValue >= brg.a && floatValue <= 1.0f) {
                aggi aggiVar = agjeVar.b;
                ((alvg) aggk.a.g().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "seek", 91, "AudioPlayerImpl.kt")).t("Seeking to position: %s", Float.valueOf(floatValue));
                aggk aggkVar = (aggk) aggiVar;
                long duration = aggkVar.e().getDuration() * floatValue;
                aggkVar.d.f(Duration.ofMillis(duration));
                aggkVar.e().seekTo((int) duration);
            } else {
                throw new IllegalArgumentException("Progress must be value [0-1]");
            }
        }
        this.a.d.f(null);
        agje agjeVar2 = this.a;
        if (agjeVar2.e) {
            agjeVar2.b.b();
            this.a.e = false;
        }
    }
}
