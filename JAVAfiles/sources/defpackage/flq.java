package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flq implements flx {
    private static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final fvq f;
    private static final fvq g;
    private alog b;
    private int e;
    private frj d = new fri(1);
    private boolean c = true;

    static {
        final int i = 1;
        f = new fvq(new flp() { // from class: flo
            @Override // defpackage.flp
            public final Constructor a() {
                if (i != 0) {
                    if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                        return null;
                    }
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(flu.class).getConstructor(Integer.TYPE);
                }
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(flu.class).getConstructor(null);
            }
        });
        final int i2 = 0;
        g = new fvq(new flp() { // from class: flo
            @Override // defpackage.flp
            public final Constructor a() {
                if (i2 != 0) {
                    if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                        return null;
                    }
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(flu.class).getConstructor(Integer.TYPE);
                }
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(flu.class).getConstructor(null);
            }
        });
    }

    private final void e(int i, List list) {
        int i2;
        int i3 = 2;
        int i4 = 0;
        switch (i) {
            case 0:
                list.add(new fth(1, null));
                return;
            case 1:
                list.add(new fth(0));
                return;
            case 2:
                list.add(new ftj(null));
                return;
            case 3:
                list.add(new fmt(null));
                return;
            case 4:
                flu d = f.d(0);
                if (d != null) {
                    list.add(d);
                    return;
                } else {
                    list.add(new fnf(null));
                    return;
                }
            case 5:
                list.add(new fnh());
                return;
            case 6:
                frj frjVar = this.d;
                if (true == this.c) {
                    i3 = 0;
                }
                list.add(new fpk(new fpi(), i3, frjVar));
                return;
            case 7:
                list.add(new fpp(null));
                return;
            case 8:
                frj frjVar2 = this.d;
                if (true != this.c) {
                    i2 = 32;
                } else {
                    i2 = 0;
                }
                int i5 = alog.d;
                list.add(new fqd(frjVar2, i2, alsx.a));
                frj frjVar3 = this.d;
                if (true != this.c) {
                    i4 = 16;
                }
                list.add(new fqg(frjVar3, i4));
                return;
            case 9:
                list.add(new fqq());
                return;
            case 10:
                list.add(new fug());
                return;
            case 11:
                if (this.b == null) {
                    int i6 = alog.d;
                    this.b = alsx.a;
                }
                list.add(new fuo(!this.c ? 1 : 0, this.d, new euj(0L), new ghw(this.b, (byte[]) null)));
                return;
            case 12:
                list.add(new fuv());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new fnn(this.e, 0));
                return;
            case 15:
                flu d2 = g.d(new Object[0]);
                if (d2 != null) {
                    list.add(d2);
                    return;
                }
                return;
            case 16:
                list.add(new fmw(!this.c ? 1 : 0, this.d));
                return;
            case 17:
                list.add(new fnn(2, 0, (char[]) null));
                return;
            case 18:
                list.add(new fnm(2, (char[]) null));
                return;
            case 19:
                list.add(new fnn(1, 0, (byte[]) null));
                return;
            case 20:
                list.add(new fnm(0));
                return;
            case 21:
                list.add(new fnm(1, (byte[]) null));
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01fb A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0048 A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03cb A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0207 A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    @Override // defpackage.flx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.flu[] a(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flq.a(android.net.Uri, java.util.Map):flu[]");
    }

    @Deprecated
    public final synchronized void b(boolean z) {
        this.c = z;
    }

    public final synchronized void c() {
        this.e = 1;
    }

    public final synchronized void d(frj frjVar) {
        this.d = frjVar;
    }
}
