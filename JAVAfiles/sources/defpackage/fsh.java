package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsh implements frl {
    private static final Pattern a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final fsg c;
    private final euf d;
    private Map e;
    private float f;
    private float g;

    public fsh() {
        this(null);
    }

    private static float d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    private static int e(long j, List list, List list2) {
        int i;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) list.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) list.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    private static long f(String str) {
        Matcher matcher = a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = eul.a;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:192:0x0041. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(defpackage.euf r29, java.nio.charset.Charset r30) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsh.g(euf, java.nio.charset.Charset):void");
    }

    @Override // defpackage.frl
    public final /* synthetic */ frc a(byte[] bArr, int i, int i2) {
        return fsm.b(this, bArr, i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:38|(5:39|40|41|42|43)|(2:(7:46|47|48|49|50|51|52)(1:78)|53)(2:79|(1:81)(7:82|(1:56)|57|58|(1:60)(1:70)|61|(4:67|68|69|66)(4:63|64|65|66)))|54|(0)|57|58|(0)(0)|61|(0)(0)|36) */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f A[Catch: RuntimeException -> 0x019c, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x019c, blocks: (B:58:0x0173, B:60:0x017f), top: B:57:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    @Override // defpackage.frl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r27, int r28, int r29, defpackage.frk r30, defpackage.etm r31) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsh.b(byte[], int, int, frk, etm):void");
    }

    public fsh(List list) {
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
        this.d = new euf();
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        String H = eul.H((byte[]) list.get(0));
        d.s(H.startsWith("Format:"));
        fsg a2 = fsg.a(H);
        dzg.g(a2);
        this.c = a2;
        g(new euf((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    @Override // defpackage.frl
    public final /* synthetic */ void c() {
    }
}
