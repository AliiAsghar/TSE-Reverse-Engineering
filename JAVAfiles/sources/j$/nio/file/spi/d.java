package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.AbstractC0067i;
import j$.nio.file.C0062d;
import j$.nio.file.CopyOption;
import j$.nio.file.D;
import j$.nio.file.EnumC0050a;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0058h;
import j$.nio.file.attribute.s;
import j$.nio.file.m;
import j$.nio.file.p;
import j$.nio.file.v;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public abstract class d {
    private static final Set a = g.c(new Object[]{D.CREATE, D.TRUNCATE_EXISTING, D.WRITE});

    /* JADX INFO: Access modifiers changed from: protected */
    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, m... mVarArr);

    public abstract void a(Path path, EnumC0050a... enumC0050aArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, j$.nio.file.attribute.m... mVarArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, j$.nio.file.attribute.m... mVarArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract s h(Path path, Class cls, m... mVarArr);

    public abstract C0062d i(Path path);

    public abstract AbstractC0067i j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, j$.nio.file.attribute.m... mVarArr);

    public abstract SeekableByteChannel q(Path path, Set set, j$.nio.file.attribute.m... mVarArr);

    public abstract DirectoryStream r(Path path, v vVar);

    public abstract FileChannel s(Path path, Set set, j$.nio.file.attribute.m... mVarArr);

    public AbstractC0067i t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC0067i u(URI uri, Map map);

    public InputStream v(Path path, p... pVarArr) {
        if (pVarArr.length > 0) {
            for (p pVar : pVarArr) {
                if (pVar == D.APPEND || pVar == D.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(pVar) + "' not allowed");
                }
            }
        }
        return Channels.newInputStream(Files.c(path, pVarArr));
    }

    public OutputStream w(Path path, p... pVarArr) {
        Set set;
        if (pVarArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (p pVar : pVarArr) {
                if (pVar != D.READ) {
                    hashSet.add(pVar);
                } else {
                    throw new IllegalArgumentException("READ not allowed");
                }
            }
            hashSet.add(D.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new j$.nio.file.attribute.m[0]));
    }

    public abstract InterfaceC0058h x(Path path, Class cls, m... mVarArr);

    public abstract Map y(Path path, String str, m... mVarArr);

    public abstract Path z(Path path);
}
