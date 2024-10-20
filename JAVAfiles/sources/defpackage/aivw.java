package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivw implements aiuw {
    private final /* synthetic */ int a;

    public aivw(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aiwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List, java.lang.Object] */
    public static final InputStream b(aogy aogyVar) {
        aiuu aiuuVar;
        InputStream d = aogyVar.a.d((Uri) aogyVar.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        if (!aogyVar.e.isEmpty()) {
            ?? r2 = aogyVar.e;
            ArrayList arrayList2 = new ArrayList();
            for (ahiy ahiyVar : r2) {
            }
            if (!arrayList2.isEmpty()) {
                aiuuVar = new aiuu(d, arrayList2);
            } else {
                aiuuVar = null;
            }
            if (aiuuVar != null) {
                arrayList.add(aiuuVar);
            }
        }
        Iterator it = aogyVar.d.iterator();
        while (it.hasNext()) {
            arrayList.add(((aiwg) it.next()).a((Uri) aogyVar.b, (InputStream) alzz.aO(arrayList)));
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [aiwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r3v13, types: [aiwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aiwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [aiwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [aivx] */
    @Override // defpackage.aiuw
    public final /* synthetic */ Object a(aogy aogyVar) {
        long j;
        String str;
        char c;
        ahug ahugVar;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        algw b;
        ?? r0;
        int i = this.a;
        aiuv aiuvVar = null;
        if (i != 0) {
            int i2 = 0;
            int i3 = 3;
            int i4 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return b(aogyVar);
                    }
                    Uri build = ((Uri) aogyVar.b).buildUpon().path(String.valueOf(((Uri) aogyVar.f).getPath()).concat(".lock")).fragment("").build();
                    aivk n = aogyVar.a.n();
                    String uri = build.toString();
                    Semaphore semaphore = (Semaphore) n.c.get(uri);
                    if (semaphore == null) {
                        n.c.putIfAbsent(uri, new Semaphore(1));
                        semaphore = (Semaphore) n.c.get(uri);
                    }
                    try {
                        semaphore.acquire();
                        aivj aivjVar = new aivj(semaphore, 3, null);
                        try {
                            Object obj = aivjVar.a;
                            aivjVar.a = null;
                            aivj aivjVar2 = new aivj(obj, 2);
                            aivjVar.close();
                            aivm aivmVar = new aivm(aivjVar2);
                            try {
                                if (aivmVar.a != null) {
                                    aivm aivmVar2 = new aivm(aogyVar.a.h(build));
                                    try {
                                        Closeable closeable = aivmVar2.a;
                                        if (closeable instanceof aivc) {
                                            convertMaybeLegacyFileChannelFromLibrary = ((aivc) closeable).a();
                                        } else if (closeable instanceof RandomAccessFile) {
                                            convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable).getChannel());
                                        } else {
                                            throw new IOException("Lock stream not convertible to FileChannel");
                                        }
                                        aogyVar.a.n();
                                        algw b2 = aivk.b(convertMaybeLegacyFileChannelFromLibrary);
                                        if (b2.f()) {
                                            r0 = b2.b();
                                        } else {
                                            aivk.a.longValue();
                                            aivk.b.longValue();
                                            d.s(true);
                                            d.s(true);
                                            aivr aivrVar = new aivr();
                                            do {
                                                SystemClock.sleep(aivrVar.next().longValue());
                                                b = aivk.b(convertMaybeLegacyFileChannelFromLibrary);
                                            } while (!b.f());
                                            r0 = b.b();
                                        }
                                        aivm aivmVar3 = new aivm(r0);
                                        try {
                                            if (aivmVar3.a == null) {
                                                aivmVar3.close();
                                                aivmVar2.close();
                                            } else {
                                                final Closeable a = aivmVar.a();
                                                final Closeable a2 = aivmVar2.a();
                                                final Closeable a3 = aivmVar3.a();
                                                ?? r7 = new Closeable() { // from class: aivx
                                                    @Override // java.io.Closeable, java.lang.AutoCloseable
                                                    public final void close() {
                                                        Closeable closeable2 = a;
                                                        Closeable closeable3 = a2;
                                                        Closeable closeable4 = a3;
                                                        if (closeable4 != null) {
                                                            try {
                                                                try {
                                                                    closeable4.close();
                                                                } catch (Throwable th) {
                                                                    if (closeable3 != null) {
                                                                        try {
                                                                            closeable3.close();
                                                                        } catch (Throwable th2) {
                                                                            th.addSuppressed(th2);
                                                                        }
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th3) {
                                                                if (closeable2 != null) {
                                                                    try {
                                                                        closeable2.close();
                                                                    } catch (Throwable th4) {
                                                                        th3.addSuppressed(th4);
                                                                    }
                                                                }
                                                                throw th3;
                                                            }
                                                        }
                                                        if (closeable3 != null) {
                                                            closeable3.close();
                                                        }
                                                        if (closeable2 != null) {
                                                            closeable2.close();
                                                        }
                                                    }
                                                };
                                                aivmVar3.close();
                                                aivmVar2.close();
                                                aiuvVar = r7;
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                                aivmVar.close();
                                return aiuvVar;
                            } finally {
                            }
                        } finally {
                        }
                    } catch (InterruptedException e) {
                        throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
                    }
                } else {
                    OutputStream g = aogyVar.a.g((Uri) aogyVar.f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(g);
                    if (!aogyVar.e.isEmpty()) {
                        ?? r6 = aogyVar.e;
                        Object obj2 = aogyVar.b;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = r6.iterator();
                        while (it.hasNext()) {
                            ahix b3 = ((ahiy) it.next()).b((Uri) obj2);
                            if (b3 != null) {
                                arrayList2.add(b3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            aiuvVar = new aiuv(g, arrayList2);
                        }
                        if (aiuvVar != null) {
                            arrayList.add(aiuvVar);
                        }
                    }
                    Iterator it2 = aogyVar.d.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((aiwg) it2.next()).d((OutputStream) alzz.aO(arrayList)));
                    }
                    Collections.reverse(arrayList);
                    return (OutputStream) arrayList.get(0);
                }
            } else {
                InputStream b4 = b(aogyVar);
                try {
                    aozg J = aozg.J(b4);
                    ahui ahuiVar = ahui.a;
                    int k = J.k();
                    if (k <= 1) {
                        J.k();
                        int e2 = J.e(J.n());
                        ahud ahudVar = (ahud) apag.parseFrom(ahud.a, J, aozs.a());
                        J.A(e2);
                        byte[] F = J.F();
                        ahuf ahufVar = new ahuf(0);
                        try {
                            ((Inflater) ahufVar.a).setInput(F);
                            try {
                                aozg J2 = aozg.J(new ahue(ahufVar));
                                ahuh ahuhVar = ahuh.a;
                                int j2 = J2.j();
                                if (j2 >= 0) {
                                    alqd alqdVar = new alqd(also.a);
                                    long j3 = 0;
                                    while (i2 < j2) {
                                        int i5 = i2;
                                        long r = J2.r();
                                        int i6 = (int) r;
                                        long j4 = r >>> i3;
                                        if (j4 == 0) {
                                            str = J2.x();
                                            j = 0;
                                        } else {
                                            long j5 = j4 + j3;
                                            if (j5 <= 2305843009213693951L) {
                                                j = j5;
                                                str = null;
                                            } else {
                                                throw new apba("Flag name larger than max size");
                                            }
                                        }
                                        int i7 = i6 & 7;
                                        if (i7 != 0 && i7 != i4) {
                                            c = 2;
                                            if (i7 != 2) {
                                                if (i7 != i3) {
                                                    if (i7 != 4) {
                                                        if (i7 == 5) {
                                                            ahugVar = new ahug(j, str, i7, 0L, J2.F());
                                                        } else {
                                                            throw new apba("Unrecognized flag type " + i7);
                                                        }
                                                    } else {
                                                        ahugVar = new ahug(j, str, i7, 0L, J2.x());
                                                    }
                                                } else {
                                                    ahugVar = new ahug(j, str, i7, Double.doubleToRawLongBits(J2.b()), null);
                                                }
                                            } else {
                                                ahugVar = new ahug(j, str, i7, J2.r(), null);
                                            }
                                        } else {
                                            c = 2;
                                            ahugVar = new ahug(j, str, i7, 0L, null);
                                        }
                                        long j6 = ahugVar.a;
                                        if (j6 != 0) {
                                            j3 = j6;
                                        }
                                        alqdVar.m(ahugVar);
                                        i3 = 3;
                                        i4 = 1;
                                        i2 = i5 + 1;
                                    }
                                    ahuh ahuhVar2 = new ahuh(alqdVar.g());
                                    ahufVar.close();
                                    ahui ahuiVar2 = new ahui(ahuhVar2, ahudVar);
                                    if (b4 != null) {
                                        b4.close();
                                    }
                                    return ahuiVar2;
                                }
                                throw new apba("Negative number of flags");
                            } finally {
                                ((Inflater) ahufVar.a).reset();
                            }
                        } finally {
                        }
                    } else {
                        throw new apba("Unsupported version: " + k + ". Current version is: 1");
                    }
                } finally {
                }
            }
        } else {
            if (!aogyVar.z()) {
                return new agrk(aogyVar.c, aogyVar.b, (byte[]) null);
            }
            throw new aivn("Transforms are not supported by this Opener: ".concat(String.valueOf(String.valueOf(aogyVar.b))));
        }
    }
}
