package androidx.media;

import defpackage.gnb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(gnb gnbVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = gnbVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = gnbVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = gnbVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = gnbVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, gnb gnbVar) {
        gnbVar.h(audioAttributesImplBase.a, 1);
        gnbVar.h(audioAttributesImplBase.b, 2);
        gnbVar.h(audioAttributesImplBase.c, 3);
        gnbVar.h(audioAttributesImplBase.d, 4);
    }
}
