package androidx.media;

import android.media.AudioAttributes;
import defpackage.gnb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(gnb gnbVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) gnbVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = gnbVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, gnb gnbVar) {
        gnbVar.i(audioAttributesImplApi26.a, 1);
        gnbVar.h(audioAttributesImplApi26.b, 2);
    }
}
