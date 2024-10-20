package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcc extends AudioDeviceCallback {
    final /* synthetic */ fcf a;

    public fcc(fcf fcfVar) {
        this.a = fcfVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        fcf fcfVar = this.a;
        fcfVar.a(fcb.d(fcfVar.a, fcfVar.g, fcfVar.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        efu efuVar = this.a.i;
        int i = eul.a;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i2], efuVar)) {
                this.a.i = null;
                break;
            }
            i2++;
        }
        fcf fcfVar = this.a;
        fcfVar.a(fcb.d(fcfVar.a, fcfVar.g, fcfVar.i));
    }
}
