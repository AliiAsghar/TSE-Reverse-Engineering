package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.compose.ui.platform.ComposeView;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbh extends arpw implements arqv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(aezf aezfVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = aezfVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((afbh) c((asaj) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((afbh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        ComposeView composeView = null;
        Instant instant = null;
        switch (this.b) {
            case 0:
                aqil.P(obj);
                afbo afboVar = (afbo) this.a;
                afboVar.b = true;
                afboVar.c.d();
                return arnb.a;
            case 1:
                aqil.P(obj);
                ((aezf) this.a).i.a();
                return arnb.a;
            case 2:
                aqil.P(obj);
                afbo afboVar2 = (afbo) this.a;
                afboVar2.a = true;
                afboVar2.c.d();
                return arnb.a;
            case 3:
                aqil.P(obj);
                if (((afeq) this.a).e == null) {
                    alvw g = afeq.a.g();
                    g.X(alwp.a, "HugoAudio");
                    ((alvg) g.h("com/google/android/libraries/compose/audio/codec/AmrEncoder$prepare$2", "invokeSuspend", 53, "AmrEncoder.kt")).t("Preparing AmrEncoder with configuration: %s", ((afeq) this.a).d.toString());
                    afer aferVar = ((afeq) this.a).d;
                    MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/3gpp", aferVar.c, 1);
                    createAudioFormat.setInteger("bitrate", aferVar.d);
                    createAudioFormat.setInteger("pcm-encoding", 2);
                    createAudioFormat.getClass();
                    Object obj2 = this.a;
                    MediaCodec bW = aeke.bW(createAudioFormat);
                    bW.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                    ((afeq) obj2).e = bW;
                    return arnb.a;
                }
                throw new IllegalStateException("This instance has already been prepared");
            case 4:
                aqil.P(obj);
                if (((afev) this.a).d == null) {
                    alvw g2 = afev.a.g();
                    g2.X(alwp.a, "HugoAudio");
                    ((alvg) g2.h("com/google/android/libraries/compose/audio/codec/Mpeg4Encoder$prepare$2", "invokeSuspend", 61, "Mpeg4Encoder.kt")).t("Preparing Mpeg4Encoder with configuration: %s", ((afev) this.a).c.toString());
                    afew afewVar = ((afev) this.a).c;
                    MediaFormat createAudioFormat2 = MediaFormat.createAudioFormat("audio/mp4a-latm", afewVar.c, 1);
                    createAudioFormat2.setInteger("bitrate", afewVar.d);
                    createAudioFormat2.setInteger("aac-profile", 2);
                    createAudioFormat2.setInteger("pcm-encoding", 2);
                    createAudioFormat2.getClass();
                    Object obj3 = this.a;
                    MediaCodec bW2 = aeke.bW(createAudioFormat2);
                    bW2.configure(createAudioFormat2, (Surface) null, (MediaCrypto) null, 1);
                    ((afev) obj3).d = bW2;
                    return arnb.a;
                }
                throw new IllegalStateException("This instance has already been prepared");
            case 5:
                aqil.P(obj);
                ((arxw) this.a).T(arnb.a);
                return arnb.a;
            case 6:
                aqil.P(obj);
                ((afmd) this.a).d = new afly().a;
                return arnb.a;
            case 7:
                aqil.P(obj);
                Object obj4 = this.a;
                ((no) obj4).v(0, ((afoq) obj4).g.size(), afol.a);
                return arnb.a;
            case 8:
                aqil.P(obj);
                afpg afpgVar = (afpg) this.a;
                afpgVar.b.N().c(new afpe(afpgVar));
                return arnb.a;
            case 9:
                aqil.P(obj);
                afre afreVar = (afre) this.a;
                anib anibVar = afreVar.d;
                if (anibVar != null) {
                    afreVar.q(anibVar);
                }
                Object obj5 = this.a;
                afre afreVar2 = (afre) obj5;
                afreVar2.d = null;
                ComposeView composeView2 = afreVar2.c;
                if (composeView2 == null) {
                    arro.b("contentComposeView");
                } else {
                    composeView = composeView2;
                }
                composeView.a(new cdj(529805232, true, new aeyl(obj5, 14)));
                return arnb.a;
            default:
                aqil.P(obj);
                jko jkoVar = (jko) ((agcm) ((agcj) this.a).c).b.b;
                jkoVar.e = jkoVar.a.f();
                jkoVar.f = jkoVar.b();
                mdc c = jkoVar.c();
                amqi amqiVar = amqi.FULL_SCREEN;
                amqf amqfVar = amqf.LOADED;
                Integer valueOf = Integer.valueOf(jkoVar.f);
                Instant instant2 = jkoVar.e;
                if (instant2 == null) {
                    arro.b("openingTime");
                } else {
                    instant = instant2;
                }
                amqe amqeVar = jkoVar.c;
                amqh amqhVar = jkoVar.b;
                Instant instant3 = jkoVar.d;
                instant3.getClass();
                c.d(amqhVar, amqiVar, amqeVar, amqfVar, valueOf, albo.ca(instant, instant3));
                return arnb.a;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.b) {
            case 0:
                return new afbh((afbo) this.a, arpeVar, 0);
            case 1:
                return new afbh((aezf) this.a, arpeVar, 1);
            case 2:
                return new afbh((afbo) this.a, arpeVar, 2, null);
            case 3:
                return new afbh((afeq) this.a, arpeVar, 3);
            case 4:
                return new afbh((afev) this.a, arpeVar, 4);
            case 5:
                return new afbh((arvv) this.a, arpeVar, 5);
            case 6:
                return new afbh((afmd) this.a, arpeVar, 6);
            case 7:
                return new afbh((afoq) this.a, arpeVar, 7);
            case 8:
                return new afbh((afpg) this.a, arpeVar, 8);
            case 9:
                return new afbh((afre) this.a, arpeVar, 9);
            default:
                return new afbh((agcj) this.a, arpeVar, 10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(afbo afboVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = afboVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(afbo afboVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = afboVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(afeq afeqVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = afeqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(afev afevVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = afevVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(afmd afmdVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = afmdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(afoq afoqVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = afoqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(afpg afpgVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = afpgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(afre afreVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = afreVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(agcj agcjVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = agcjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbh(arvv arvvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = arvvVar;
    }
}
