package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkz implements ComponentCallbacks2 {
    private static volatile hkz g;
    private static volatile boolean h;
    public final hqa a;
    public final hqv b;
    public final hlf c;
    public final List d = new ArrayList();
    public final hqh e;
    public final hld f;
    private final hpf i;
    private final hwh j;

    public hkz(Context context, hpf hpfVar, hqv hqvVar, hqa hqaVar, hqh hqhVar, hwh hwhVar, hld hldVar, hky hkyVar, Map map, List list, List list2, hwq hwqVar, hgj hgjVar) {
        hlg hlgVar = hlg.LOW;
        this.i = hpfVar;
        this.a = hqaVar;
        this.e = hqhVar;
        this.b = hqvVar;
        this.j = hwhVar;
        this.f = hldVar;
        this.c = new hlf(context, hqhVar, new hln(this, list2, hwqVar), new hwr(null), hkyVar, map, list, hpfVar, hgjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f2 A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0201 A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0211 A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021c A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0255 A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e A[Catch: all -> 0x02b2, LOOP:3: B:71:0x0158->B:73:0x015e, LOOP_END, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0167 A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0188 A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019e A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cd A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8 A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:13:0x001d, B:15:0x0032, B:16:0x0039, B:18:0x003e, B:20:0x004f, B:23:0x0054, B:25:0x005c, B:26:0x0073, B:27:0x007d, B:29:0x0083, B:32:0x0097, B:35:0x00a6, B:41:0x00b2, B:43:0x00ba, B:45:0x00d3, B:47:0x00dd, B:48:0x00e5, B:50:0x00eb, B:53:0x00fb, B:55:0x0103, B:56:0x0116, B:61:0x011a, B:63:0x0122, B:64:0x0126, B:66:0x012c, B:69:0x014c, B:70:0x0152, B:71:0x0158, B:73:0x015e, B:76:0x0167, B:77:0x016a, B:79:0x016e, B:80:0x0184, B:82:0x0188, B:83:0x019a, B:85:0x019e, B:88:0x01a7, B:90:0x01b9, B:92:0x01bd, B:93:0x01c9, B:95:0x01cd, B:96:0x01d4, B:98:0x01d8, B:100:0x01de, B:101:0x01e7, B:102:0x01ee, B:104:0x01f2, B:105:0x01fd, B:107:0x0201, B:108:0x020d, B:110:0x0211, B:111:0x0218, B:113:0x021c, B:114:0x0251, B:116:0x0255, B:117:0x0262, B:122:0x025c, B:124:0x00c2, B:126:0x00ca), top: B:12:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.hkz b(android.content.Context r25) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkz.b(android.content.Context):hkz");
    }

    public static hls c(Context context) {
        return e(context).b(context);
    }

    public static hls d(View view) {
        hwh e = e(view.getContext());
        if (hyv.k()) {
            return e.b(view.getContext().getApplicationContext());
        }
        hwr.i(view);
        d.aB(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a = hwh.a(view.getContext());
        if (a == null) {
            return e.b(view.getContext().getApplicationContext());
        }
        if (a instanceof cj) {
            cj cjVar = (cj) a;
            e.a.clear();
            hwh.e(cjVar.a().l(), e.a);
            View findViewById = cjVar.findViewById(R.id.content);
            cg cgVar = null;
            while (!view.equals(findViewById) && (cgVar = (cg) e.a.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            e.a.clear();
            if (cgVar != null) {
                return e.c(cgVar);
            }
            return e.d(cjVar);
        }
        return e.b(view.getContext().getApplicationContext());
    }

    public static hwh e(Context context) {
        d.aB(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).j;
    }

    private static GeneratedAppGlideModule i(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e) {
            j(e);
            return null;
        } catch (InstantiationException e2) {
            j(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            j(e3);
            return null;
        } catch (InvocationTargetException e4) {
            j(e4);
            return null;
        }
    }

    private static void j(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.c.getBaseContext();
    }

    public final void f() {
        hyv.h();
        this.i.c.a().b();
    }

    public final void g() {
        hyv.i();
        this.b.e();
        this.a.c();
        this.e.b();
    }

    public final void h(int i) {
        hyv.i();
        synchronized (this.d) {
            for (hls hlsVar : this.d) {
            }
        }
        Object obj = this.b;
        if (i >= 40) {
            ((hyr) obj).e();
        } else {
            if (i < 20) {
                if (i == 15) {
                    i = 15;
                }
            }
            hyr hyrVar = (hyr) obj;
            hyrVar.k(hyrVar.g() / 2);
        }
        this.a.f(i);
        this.e.d(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        g();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        h(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
