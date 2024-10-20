package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcb {
    static final alor b;
    private final SparseArray d = new SparseArray();
    private final int e;
    public static final fcb a = new fcb(alog.r(fca.a));
    private static final alog c = alog.t(2, 5, 6);

    static {
        alok alokVar = new alok();
        alokVar.h(5, 6);
        alokVar.h(17, 6);
        alokVar.h(7, 6);
        alokVar.h(30, 10);
        alokVar.h(18, 6);
        alokVar.h(6, 8);
        alokVar.h(8, 8);
        alokVar.h(14, 8);
        b = alokVar.b();
    }

    public fcb(List list) {
        for (int i = 0; i < ((alsx) list).c; i++) {
            fca fcaVar = (fca) list.get(i);
            this.d.put(fcaVar.b, fcaVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            i2 = Math.max(i2, ((fca) this.d.valueAt(i3)).c);
        }
        this.e = i2;
    }

    public static boolean b() {
        if (!"Amazon".equals(eul.c) && !"Xiaomi".equals(eul.c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fcb d(Context context, epz epzVar, efu efuVar) {
        return e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), epzVar, efuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fcb e(Context context, Intent intent, epz epzVar, efu efuVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        boolean z;
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        Object systemService = context.getSystemService("audio");
        dzg.g(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        if (efuVar == null) {
            efu efuVar2 = null;
            if (eul.a >= 33) {
                try {
                    audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) epzVar.a().a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        efuVar2 = new efu((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            efuVar = efuVar2;
        }
        if (eul.a >= 33 && (eul.aa(context) || eul.U(context))) {
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) epzVar.a().a);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(albo.cx(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile m = fbw$$ExternalSyntheticApiModelOutline2.m(directProfilesForAttributes.get(i));
                encapsulationType = m.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = m.getFormat();
                    if (eul.W(format) || b.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (!hashMap.containsKey(valueOf)) {
                            channelMasks = m.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(albo.cx(channelMasks)));
                        } else {
                            Set set = (Set) hashMap.get(valueOf);
                            dzg.g(set);
                            channelMasks2 = m.getChannelMasks();
                            set.addAll(albo.cx(channelMasks2));
                        }
                    }
                }
            }
            alob alobVar = new alob();
            for (Map.Entry entry : hashMap.entrySet()) {
                alobVar.h(new fca(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new fcb(alobVar.g());
        }
        if (efuVar == null) {
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{(AudioDeviceInfo) efuVar.a};
        }
        alpr alprVar = new alpr();
        alprVar.i(8, 7);
        if (eul.a >= 31) {
            alprVar.i(26, 27);
        }
        if (eul.a >= 33) {
            alprVar.c(30);
        }
        alpt g = alprVar.g();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (g.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return a;
            }
        }
        alpr alprVar2 = new alpr();
        alprVar2.c(2);
        if (eul.a >= 29 && (eul.aa(context) || eul.U(context))) {
            alob alobVar2 = new alob();
            aluq listIterator = b.keySet().listIterator();
            while (listIterator.hasNext()) {
                Integer num = (Integer) listIterator.next();
                int intValue = num.intValue();
                if (eul.a >= eul.g(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) epzVar.a().a);
                    if (isDirectPlaybackSupported) {
                        alobVar2.h(num);
                    }
                }
            }
            alobVar2.h(2);
            alprVar2.j(alobVar2.g());
            return new fcb(f(albo.cy(alprVar2.g()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((z || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            alprVar2.j(c);
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                alprVar2.j(albo.cx(intArrayExtra));
            }
            return new fcb(f(albo.cy(alprVar2.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new fcb(f(albo.cy(alprVar2.g()), 10));
    }

    private static alog f(int[] iArr, int i) {
        alob alobVar = new alob();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            alobVar.h(new fca(i2, i));
        }
        return alobVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
    
        if (r7 != 5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x003e, code lost:
    
        if (c(30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(defpackage.eqn r11, defpackage.epz r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcb.a(eqn, epz):android.util.Pair");
    }

    public final boolean c(int i) {
        return eul.S(this.d, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof defpackage.fcb
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fcb r9 = (defpackage.fcb) r9
            android.util.SparseArray r1 = r8.d
            android.util.SparseArray r3 = r9.d
            int r4 = defpackage.eul.a
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = defpackage.fbw$$ExternalSyntheticApiModelOutline2.m(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.e
            int r9 = r9.e
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = eul.a;
        SparseArray sparseArray = this.d;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return this.e + (i * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.e + ", audioProfiles=" + this.d.toString() + "]";
    }
}
