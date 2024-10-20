package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmf implements hmb {
    private static final String k = "hmf";
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final ico j;
    private int[] l;
    private short[] n;
    private byte[] o;
    private byte[] p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final int[] m = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public hmd f = new hmd();

    public hmf(ico icoVar, hmd hmdVar, ByteBuffer byteBuffer, int i) {
        this.j = icoVar;
        c(hmdVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hqa, java.lang.Object] */
    private final Bitmap e() {
        Bitmap.Config config;
        Boolean bool = this.h;
        if (bool != null && !bool.booleanValue()) {
            config = this.i;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        ico icoVar = this.j;
        Bitmap b = icoVar.b.b(this.u, this.t, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
    
        if (r4.j == r3.h) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b1 A[Catch: all -> 0x050b, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0011, B:8:0x003c, B:13:0x0046, B:15:0x004f, B:16:0x0057, B:18:0x0069, B:19:0x0075, B:21:0x0079, B:22:0x007d, B:24:0x0081, B:26:0x0089, B:27:0x009a, B:31:0x009e, B:33:0x00a2, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:40:0x00c3, B:42:0x00c7, B:43:0x00cc, B:45:0x00d3, B:47:0x00d7, B:49:0x00db, B:51:0x00e0, B:54:0x00e6, B:56:0x00ea, B:58:0x00f2, B:60:0x00f9, B:61:0x010d, B:63:0x0111, B:65:0x0116, B:67:0x011b, B:71:0x0121, B:73:0x0125, B:75:0x0138, B:77:0x0141, B:78:0x014e, B:80:0x0152, B:82:0x015d, B:84:0x0165, B:85:0x0169, B:87:0x016f, B:88:0x0173, B:90:0x0179, B:91:0x017f, B:93:0x0193, B:95:0x019c, B:99:0x01ba, B:146:0x01df, B:147:0x02a3, B:149:0x02aa, B:152:0x02b1, B:154:0x02c7, B:158:0x02df, B:160:0x02e7, B:162:0x02eb, B:164:0x02ef, B:169:0x02f8, B:172:0x0300, B:174:0x0304, B:178:0x0318, B:179:0x04ad, B:181:0x04b1, B:185:0x04b8, B:187:0x04bc, B:188:0x04c2, B:189:0x04d6, B:192:0x030d, B:199:0x0320, B:201:0x0345, B:204:0x034d, B:211:0x036f, B:212:0x0376, B:214:0x0379, B:220:0x0391, B:222:0x039a, B:224:0x03a8, B:227:0x03a1, B:234:0x0489, B:235:0x03b9, B:237:0x03c0, B:238:0x03d2, B:240:0x03d8, B:243:0x03e1, B:245:0x03ec, B:247:0x0408, B:251:0x0411, B:252:0x0416, B:254:0x041b, B:257:0x0422, B:259:0x042d, B:261:0x0442, B:268:0x045f, B:270:0x046d, B:273:0x0466, B:277:0x044b, B:293:0x0499, B:297:0x04a7, B:298:0x04a3, B:104:0x01f0, B:107:0x0214, B:111:0x022f, B:113:0x0238, B:118:0x0247, B:121:0x0251, B:123:0x025a, B:125:0x0266, B:129:0x0277, B:132:0x0284, B:299:0x01c7, B:303:0x0155, B:304:0x0149, B:306:0x04ef, B:308:0x04f8, B:311:0x0015, B:313:0x001d, B:314:0x003a), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04bc A[Catch: all -> 0x050b, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0011, B:8:0x003c, B:13:0x0046, B:15:0x004f, B:16:0x0057, B:18:0x0069, B:19:0x0075, B:21:0x0079, B:22:0x007d, B:24:0x0081, B:26:0x0089, B:27:0x009a, B:31:0x009e, B:33:0x00a2, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:40:0x00c3, B:42:0x00c7, B:43:0x00cc, B:45:0x00d3, B:47:0x00d7, B:49:0x00db, B:51:0x00e0, B:54:0x00e6, B:56:0x00ea, B:58:0x00f2, B:60:0x00f9, B:61:0x010d, B:63:0x0111, B:65:0x0116, B:67:0x011b, B:71:0x0121, B:73:0x0125, B:75:0x0138, B:77:0x0141, B:78:0x014e, B:80:0x0152, B:82:0x015d, B:84:0x0165, B:85:0x0169, B:87:0x016f, B:88:0x0173, B:90:0x0179, B:91:0x017f, B:93:0x0193, B:95:0x019c, B:99:0x01ba, B:146:0x01df, B:147:0x02a3, B:149:0x02aa, B:152:0x02b1, B:154:0x02c7, B:158:0x02df, B:160:0x02e7, B:162:0x02eb, B:164:0x02ef, B:169:0x02f8, B:172:0x0300, B:174:0x0304, B:178:0x0318, B:179:0x04ad, B:181:0x04b1, B:185:0x04b8, B:187:0x04bc, B:188:0x04c2, B:189:0x04d6, B:192:0x030d, B:199:0x0320, B:201:0x0345, B:204:0x034d, B:211:0x036f, B:212:0x0376, B:214:0x0379, B:220:0x0391, B:222:0x039a, B:224:0x03a8, B:227:0x03a1, B:234:0x0489, B:235:0x03b9, B:237:0x03c0, B:238:0x03d2, B:240:0x03d8, B:243:0x03e1, B:245:0x03ec, B:247:0x0408, B:251:0x0411, B:252:0x0416, B:254:0x041b, B:257:0x0422, B:259:0x042d, B:261:0x0442, B:268:0x045f, B:270:0x046d, B:273:0x0466, B:277:0x044b, B:293:0x0499, B:297:0x04a7, B:298:0x04a3, B:104:0x01f0, B:107:0x0214, B:111:0x022f, B:113:0x0238, B:118:0x0247, B:121:0x0251, B:123:0x025a, B:125:0x0266, B:129:0x0277, B:132:0x0284, B:299:0x01c7, B:303:0x0155, B:304:0x0149, B:306:0x04ef, B:308:0x04f8, B:311:0x0015, B:313:0x001d, B:314:0x003a), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111 A[Catch: all -> 0x050b, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0011, B:8:0x003c, B:13:0x0046, B:15:0x004f, B:16:0x0057, B:18:0x0069, B:19:0x0075, B:21:0x0079, B:22:0x007d, B:24:0x0081, B:26:0x0089, B:27:0x009a, B:31:0x009e, B:33:0x00a2, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:40:0x00c3, B:42:0x00c7, B:43:0x00cc, B:45:0x00d3, B:47:0x00d7, B:49:0x00db, B:51:0x00e0, B:54:0x00e6, B:56:0x00ea, B:58:0x00f2, B:60:0x00f9, B:61:0x010d, B:63:0x0111, B:65:0x0116, B:67:0x011b, B:71:0x0121, B:73:0x0125, B:75:0x0138, B:77:0x0141, B:78:0x014e, B:80:0x0152, B:82:0x015d, B:84:0x0165, B:85:0x0169, B:87:0x016f, B:88:0x0173, B:90:0x0179, B:91:0x017f, B:93:0x0193, B:95:0x019c, B:99:0x01ba, B:146:0x01df, B:147:0x02a3, B:149:0x02aa, B:152:0x02b1, B:154:0x02c7, B:158:0x02df, B:160:0x02e7, B:162:0x02eb, B:164:0x02ef, B:169:0x02f8, B:172:0x0300, B:174:0x0304, B:178:0x0318, B:179:0x04ad, B:181:0x04b1, B:185:0x04b8, B:187:0x04bc, B:188:0x04c2, B:189:0x04d6, B:192:0x030d, B:199:0x0320, B:201:0x0345, B:204:0x034d, B:211:0x036f, B:212:0x0376, B:214:0x0379, B:220:0x0391, B:222:0x039a, B:224:0x03a8, B:227:0x03a1, B:234:0x0489, B:235:0x03b9, B:237:0x03c0, B:238:0x03d2, B:240:0x03d8, B:243:0x03e1, B:245:0x03ec, B:247:0x0408, B:251:0x0411, B:252:0x0416, B:254:0x041b, B:257:0x0422, B:259:0x042d, B:261:0x0442, B:268:0x045f, B:270:0x046d, B:273:0x0466, B:277:0x044b, B:293:0x0499, B:297:0x04a7, B:298:0x04a3, B:104:0x01f0, B:107:0x0214, B:111:0x022f, B:113:0x0238, B:118:0x0247, B:121:0x0251, B:123:0x025a, B:125:0x0266, B:129:0x0277, B:132:0x0284, B:299:0x01c7, B:303:0x0155, B:304:0x0149, B:306:0x04ef, B:308:0x04f8, B:311:0x0015, B:313:0x001d, B:314:0x003a), top: B:3:0x0009 }] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v69, types: [short] */
    /* JADX WARN: Type inference failed for: r2v71 */
    @Override // defpackage.hmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmf.a():android.graphics.Bitmap");
    }

    @Override // defpackage.hmb
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(hmd hmdVar, ByteBuffer byteBuffer, int i) {
        int[] iArr;
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.r = 0;
            this.f = hmdVar;
            this.e = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.a.order(ByteOrder.LITTLE_ENDIAN);
            this.q = false;
            Iterator it = hmdVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((hmc) it.next()).g == 3) {
                    this.q = true;
                    break;
                }
            }
            this.s = highestOneBit;
            int i2 = hmdVar.f;
            this.u = i2 / highestOneBit;
            int i3 = hmdVar.g;
            this.t = i3 / highestOneBit;
            this.c = this.j.m(i2 * i3);
            ico icoVar = this.j;
            int i4 = this.u * this.t;
            Object obj = icoVar.a;
            if (obj == null) {
                iArr = new int[i4];
            } else {
                iArr = (int[]) ((hqh) obj).a(i4, int[].class);
            }
            this.d = iArr;
        } else {
            throw new IllegalArgumentException(a.bV(i, "Sample size must be >=0, not: "));
        }
    }
}
