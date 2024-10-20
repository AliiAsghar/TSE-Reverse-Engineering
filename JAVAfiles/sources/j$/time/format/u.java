package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u extends t {
    private static final ConcurrentHashMap i = new ConcurrentHashMap();
    private final H e;
    private final boolean f;
    private final HashMap g;
    private final HashMap h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(H h, boolean z) {
        super(j$.time.temporal.j.k(), "ZoneText(" + String.valueOf(h) + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.a(h, "textStyle");
        this.e = h;
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.time.format.t
    public final n a(w wVar) {
        HashMap hashMap;
        n f;
        H h = H.NARROW;
        H h2 = this.e;
        if (h2 == h) {
            return super.a(wVar);
        }
        Locale i2 = wVar.i();
        boolean k = wVar.k();
        Set a = j$.time.zone.i.a();
        int size = a.size();
        if (k) {
            hashMap = this.g;
        } else {
            hashMap = this.h;
        }
        Map.Entry entry = (Map.Entry) hashMap.get(i2);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (f = (n) ((SoftReference) entry.getValue()).get()) == null) {
            f = n.f(wVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i2).getZoneStrings();
            int length = zoneStrings.length;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i3];
                String str = strArr[0];
                if (a.contains(str)) {
                    f.a(str, str);
                    String a2 = I.a(str, i2);
                    if (h2 != H.FULL) {
                        i4 = 2;
                    }
                    while (i4 < strArr.length) {
                        f.a(strArr[i4], a2);
                        i4 += 2;
                    }
                }
                i3++;
            }
            hashMap.put(i2, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(f)));
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // j$.time.format.t, j$.time.format.InterfaceC0086f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(j$.time.format.z r14, java.lang.StringBuilder r15) {
        /*
            r13 = this;
            j$.time.temporal.n r0 = j$.time.temporal.j.l()
            java.lang.Object r0 = r14.f(r0)
            j$.time.ZoneId r0 = (j$.time.ZoneId) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.String r2 = r0.m()
            boolean r3 = r0 instanceof j$.time.ZoneOffset
            r4 = 1
            if (r3 != 0) goto Lf6
            j$.time.temporal.TemporalAccessor r3 = r14.d()
            boolean r5 = r13.f
            r6 = 2
            if (r5 != 0) goto L74
            j$.time.temporal.ChronoField r5 = j$.time.temporal.ChronoField.INSTANT_SECONDS
            boolean r5 = r3.f(r5)
            if (r5 == 0) goto L35
            j$.time.zone.e r0 = r0.b0()
            j$.time.Instant r3 = j$.time.Instant.b0(r3)
            boolean r0 = r0.h(r3)
            goto L75
        L35:
            j$.time.temporal.ChronoField r5 = j$.time.temporal.ChronoField.EPOCH_DAY
            boolean r7 = r3.f(r5)
            if (r7 == 0) goto L74
            j$.time.temporal.ChronoField r7 = j$.time.temporal.ChronoField.NANO_OF_DAY
            boolean r8 = r3.f(r7)
            if (r8 == 0) goto L74
            long r8 = r3.y(r5)
            j$.time.LocalDate r5 = j$.time.LocalDate.q0(r8)
            long r7 = r3.y(r7)
            j$.time.LocalTime r3 = j$.time.LocalTime.j0(r7)
            j$.time.LocalDateTime r3 = j$.time.LocalDateTime.n0(r5, r3)
            j$.time.zone.e r5 = r0.b0()
            j$.time.zone.b r5 = r5.f(r3)
            if (r5 != 0) goto L74
            j$.time.zone.e r5 = r0.b0()
            j$.time.ZonedDateTime r0 = r3.p(r0)
            j$.time.Instant r0 = r0.toInstant()
            boolean r0 = r5.h(r0)
            goto L75
        L74:
            r0 = 2
        L75:
            java.util.Locale r14 = r14.c()
            j$.time.format.H r3 = j$.time.format.H.NARROW
            r5 = 0
            j$.time.format.H r7 = r13.e
            if (r7 != r3) goto L82
            goto Lf3
        L82:
            j$.util.concurrent.ConcurrentHashMap r3 = j$.time.format.u.i
            java.lang.Object r8 = r3.get(r2)
            java.lang.ref.SoftReference r8 = (java.lang.ref.SoftReference) r8
            r9 = 5
            r10 = 3
            if (r8 == 0) goto L9e
            java.lang.Object r5 = r8.get()
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L9e
            java.lang.Object r8 = r5.get(r14)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r8 != 0) goto Ld8
        L9e:
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r2)
            r11 = 7
            java.lang.String[] r11 = new java.lang.String[r11]
            r11[r1] = r2
            java.lang.String r12 = r8.getDisplayName(r1, r4, r14)
            r11[r4] = r12
            java.lang.String r12 = r8.getDisplayName(r1, r1, r14)
            r11[r6] = r12
            java.lang.String r6 = r8.getDisplayName(r4, r4, r14)
            r11[r10] = r6
            r6 = 4
            java.lang.String r1 = r8.getDisplayName(r4, r1, r14)
            r11[r6] = r1
            r11[r9] = r2
            r1 = 6
            r11[r1] = r2
            if (r5 != 0) goto Lcc
            j$.util.concurrent.ConcurrentHashMap r5 = new j$.util.concurrent.ConcurrentHashMap
            r5.<init>()
        Lcc:
            r5.put(r14, r11)
            java.lang.ref.SoftReference r14 = new java.lang.ref.SoftReference
            r14.<init>(r5)
            r3.put(r2, r14)
            r8 = r11
        Ld8:
            if (r0 == 0) goto Lec
            if (r0 == r4) goto Le4
            int r14 = r7.n()
            int r14 = r14 + r9
            r5 = r8[r14]
            goto Lf3
        Le4:
            int r14 = r7.n()
            int r14 = r14 + r10
            r5 = r8[r14]
            goto Lf3
        Lec:
            int r14 = r7.n()
            int r14 = r14 + r4
            r5 = r8[r14]
        Lf3:
            if (r5 == 0) goto Lf6
            r2 = r5
        Lf6:
            r15.append(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.u.n(j$.time.format.z, java.lang.StringBuilder):boolean");
    }
}
