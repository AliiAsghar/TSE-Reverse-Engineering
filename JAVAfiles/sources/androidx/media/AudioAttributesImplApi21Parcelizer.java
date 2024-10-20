package androidx.media;

import android.media.AudioAttributes;
import defpackage.gnb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(gnb gnbVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) gnbVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = gnbVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, gnb gnbVar) {
        gnbVar.i(audioAttributesImplApi21.a, 1);
        gnbVar.h(audioAttributesImplApi21.b, 2);
    }
}
