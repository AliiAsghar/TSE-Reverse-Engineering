package defpackage;

import android.os.Process;
import android.util.Log;
import j$.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atfa implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public atfa(atfe atfeVar, int i) {
        this.b = i;
        this.a = atfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map<String, List<String>> emptyMap;
        String str;
        int i;
        long j;
        long j2;
        int i2;
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    ((atfd) this.a).a();
                    return;
                }
                Object obj = this.a;
                try {
                    atfe atfeVar = ((atfc) obj).d;
                    atel atelVar = atfeVar.t;
                    long j3 = atfeVar.s;
                    atfl atflVar = atfeVar.o;
                    int i4 = 0;
                    if (atflVar != null) {
                        emptyMap = atflVar.getAllHeaders();
                        atfl atflVar2 = ((atfc) obj).d.o;
                        str = atflVar2.b;
                        i = atflVar2.a;
                    } else {
                        emptyMap = Collections.emptyMap();
                        str = "";
                        i = 0;
                    }
                    String str2 = str;
                    long j4 = 0;
                    for (Map.Entry entry : ((atfc) obj).d.e.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            j4 += r16.length();
                        }
                        if (((String) entry.getValue()) != null) {
                            j4 += r3.length();
                        }
                    }
                    if (emptyMap == null) {
                        j = 0;
                    } else {
                        j = 0;
                        for (Map.Entry<String, List<String>> entry2 : emptyMap.entrySet()) {
                            if (entry2.getKey() != null) {
                                j += r10.length();
                            }
                            if (entry2.getValue() != null) {
                                Iterator<String> it = entry2.getValue().iterator();
                                while (it.hasNext()) {
                                    if (it.next() != null) {
                                        j += r10.length();
                                    }
                                }
                            }
                        }
                    }
                    if (emptyMap.containsKey("Content-Length")) {
                        try {
                            j2 = Long.parseLong(emptyMap.get("Content-Length").get(0));
                        } catch (NumberFormatException unused) {
                            j2 = 0;
                        }
                    } else {
                        j2 = -1;
                    }
                    Duration ofSeconds = Duration.ofSeconds(0L);
                    Duration ofSeconds2 = Duration.ofSeconds(0L);
                    int i5 = ((atfc) obj).d.g.get();
                    if (i5 != 6) {
                        if (i5 != 7) {
                            if (i5 == 8) {
                                i2 = 3;
                            } else {
                                throw new IllegalStateException(a.cb(i5, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                            }
                        } else {
                            i2 = 1;
                        }
                    } else {
                        i2 = 2;
                    }
                    atfe atfeVar2 = ((atfc) obj).d;
                    int i6 = atfeVar2.w;
                    int i7 = atfeVar2.v;
                    atew atewVar = atfeVar2.y;
                    if (atewVar != null) {
                        i4 = atewVar.g;
                    }
                    atelVar.d(j3, new atej(j4, j, j2, i, ofSeconds, ofSeconds2, str2, i2, i6, i7, i4, atfeVar2.x, Process.myUid()));
                    return;
                } catch (RuntimeException e) {
                    Log.i(atfe.a, "Error while trying to log CronetTrafficInfo: ", e);
                    return;
                }
            }
            ((atfe) this.a).w++;
            return;
        }
        atfe atfeVar3 = (atfe) this.a;
        atfeVar3.m = atfeVar3.p;
        atfeVar3.p = null;
        atfeVar3.g();
    }

    public /* synthetic */ atfa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
