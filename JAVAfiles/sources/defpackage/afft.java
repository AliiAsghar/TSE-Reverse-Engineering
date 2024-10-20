package defpackage;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afft implements affb {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource");
    public final arpi b;
    public final affu c;
    public final ascc d;
    public final ascg e;
    public final Long f;
    public long g;
    public int h;
    private final arwe i;
    private aoxk j;
    private arxm k;
    private boolean l;

    public afft(arwe arweVar, arpi arpiVar, affu affuVar) {
        Long l;
        this.i = arweVar;
        this.b = arpiVar;
        this.c = affuVar;
        ascc e = asck.e(0, 0, 0, 5);
        this.d = e;
        this.e = new asce(e);
        Duration duration = affuVar.d;
        if (duration != null) {
            int i = affuVar.a;
            long a2 = anbx.a(duration) * i * affuVar.b;
            l = Long.valueOf((a2 + a2) / 1000000);
        } else {
            l = null;
        }
        this.f = l;
    }

    private final void f() {
        if (this.l) {
            aoxk aoxkVar = this.j;
            if (aoxkVar == null) {
                arro.b("microphoneHelper");
                aoxkVar = null;
            }
            aoxkVar.e.getClass();
            if (aoxkVar.h) {
                aoxkVar.h = false;
                try {
                    Thread thread = aoxkVar.g;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (InterruptedException e) {
                    Log.e("MicrophoneHelper", "Exception: ", e);
                }
                aoxkVar.e.stop();
                if (aoxkVar.e.getRecordingState() != 1) {
                    Log.e("MicrophoneHelper", "AudioRecord.stop() didn't run properly.");
                }
            }
            AudioRecord audioRecord = aoxkVar.e;
            audioRecord.getClass();
            if (!aoxkVar.h) {
                audioRecord.release();
            }
            Log.d("MicrophoneHelper", "AudioRecord stopped recording audio.");
            this.l = false;
        }
    }

    @Override // defpackage.affb
    public final Object a(arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "HugoAudio");
        alvg alvgVar = (alvg) g.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "prepare", 78, "MicrophoneAudioSource.kt");
        StringBuilder sb = new StringBuilder("sampleRate = ");
        affu affuVar = this.c;
        sb.append(affuVar.a);
        String sb2 = sb.toString();
        String str = "channelCount = " + affuVar.b;
        Duration duration = affuVar.c;
        Objects.toString(duration);
        String concat = "outputTimeout = ".concat(duration.toString());
        Duration duration2 = affuVar.d;
        Objects.toString(duration2);
        alvgVar.t("Preparing MicrophoneAudioSource with configuration %s", aqil.I(new String[]{sb2, str, "outputBufferCapacity = 0", concat, "maxDuration = ".concat(String.valueOf(duration2))}, null, 63));
        affu affuVar2 = this.c;
        int i = affuVar2.b;
        if (i == 1) {
            aoxk aoxkVar = new aoxk(affuVar2.a);
            this.j = aoxkVar;
            ahjj ahjjVar = new ahjj(this);
            aoxkVar.i.clear();
            aoxkVar.i.add(ahjjVar);
            return arnb.a;
        }
        throw new IllegalArgumentException(a.cb(i, "Channel count ", " not supported."));
    }

    @Override // defpackage.affb
    public final Object b(arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "HugoAudio");
        ((alvg) g.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "release", 118, "MicrophoneAudioSource.kt")).q("Releasing MicrophoneAudioSource.");
        f();
        Object fv = this.d.fv(new affc(null), arpeVar);
        if (fv == arpl.a) {
            return fv;
        }
        return arnb.a;
    }

    @Override // defpackage.affb
    public final Object c(arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "HugoAudio");
        ((alvg) g.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 96, "MicrophoneAudioSource.kt")).q("Starting MicrophoneAudioSource.");
        if (!this.l) {
            aoxk aoxkVar = this.j;
            if (aoxkVar == null) {
                arro.b("microphoneHelper");
                aoxkVar = null;
            }
            if (!aoxkVar.h) {
                Log.d("MicrophoneHelper", "AudioRecord(" + aoxkVar.a + ", " + aoxkVar.c + ")");
                AudioFormat.Builder sampleRate = new AudioFormat.Builder().setEncoding(2).setSampleRate(aoxkVar.a);
                int i = aoxkVar.b;
                aoxkVar.f = sampleRate.setChannelMask(16).build();
                aoxkVar.e = new AudioRecord.Builder().setAudioSource(1).setAudioFormat(aoxkVar.f).setBufferSizeInBytes(aoxkVar.c).build();
                if (aoxkVar.e.getState() != 1) {
                    aoxkVar.e.release();
                    Log.e("MicrophoneHelper", "AudioRecord could not open.");
                } else {
                    aoxkVar.g = new Thread(new aomp(aoxkVar, 4), "microphoneHelperRecordingThread");
                }
                aoxkVar.e.startRecording();
                if (aoxkVar.e.getRecordingState() != 3) {
                    Log.e("MicrophoneHelper", "AudioRecord couldn't start recording.");
                    aoxkVar.e.release();
                } else {
                    aoxkVar.h = true;
                    aoxkVar.g.start();
                    Log.d("MicrophoneHelper", "AudioRecord is recording audio.");
                }
            }
            this.l = true;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.affs
            if (r0 == 0) goto L13
            r0 = r9
            affs r0 = (defpackage.affs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            affs r0 = new affs
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            afft r0 = r0.d
            defpackage.aqil.P(r9)
            goto L86
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            defpackage.aqil.P(r9)
            arxm r9 = r8.k
            if (r9 == 0) goto L3c
            arnb r9 = defpackage.arnb.a
            return r9
        L3c:
            alvi r9 = defpackage.afft.a
            alvw r9 = r9.g()
            alvz r2 = defpackage.alwp.a
            java.lang.String r5 = "HugoAudio"
            r9.X(r2, r5)
            java.lang.String r2 = "onMaxDurationReached"
            r5 = 179(0xb3, float:2.51E-43)
            java.lang.String r6 = "com/google/android/libraries/compose/audio/source/MicrophoneAudioSource"
            java.lang.String r7 = "MicrophoneAudioSource.kt"
            alvw r9 = r9.h(r6, r2, r5, r7)
            alvg r9 = (defpackage.alvg) r9
            affu r2 = r8.c
            j$.time.Duration r2 = r2.d
            if (r2 == 0) goto L67
            long r5 = r2.toMillis()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            goto L68
        L67:
            r2 = r4
        L68:
            if (r2 == 0) goto L98
            java.lang.String r5 = "Max duration of %d ms reached, stopping recording."
            long r6 = r2.longValue()
            r9.s(r5, r6)
            ascc r9 = r8.d
            affc r2 = new affc
            r2.<init>(r4)
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r9.fv(r2, r0)
            if (r9 != r1) goto L85
            return r1
        L85:
            r0 = r8
        L86:
            arwe r9 = r0.i
            aely r1 = new aely
            r2 = 6
            r1.<init>(r0, r4, r2)
            r2 = 3
            arxm r9 = defpackage.arrn.J(r9, r4, r4, r1, r2)
            r0.k = r9
            arnb r9 = defpackage.arnb.a
            return r9
        L98:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot invoke onMaxDurationReached with 'null' maxDuration."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afft.d(arpe):java.lang.Object");
    }

    public final Object e(arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "HugoAudio");
        ((alvg) g.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "stop", 112, "MicrophoneAudioSource.kt")).q("Stopping MicrophoneAudioSource.");
        f();
        Object fv = this.d.fv(new affc(null), arpeVar);
        if (fv == arpl.a) {
            return fv;
        }
        return arnb.a;
    }
}
