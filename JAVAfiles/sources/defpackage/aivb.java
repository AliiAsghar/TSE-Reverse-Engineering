package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivb implements aiwd {
    public final aivk a;

    public aivb(aivk aivkVar) {
        this.a = aivkVar;
    }

    @Override // defpackage.aiwd
    public final File c(Uri uri) {
        return ahmc.ag(uri);
    }

    @Override // defpackage.aiwd
    public final InputStream d(Uri uri) {
        File ag = ahmc.ag(uri);
        return new aivo(new FileInputStream(ag), ag);
    }

    @Override // defpackage.aiwd
    public final String e() {
        return "file";
    }

    @Override // defpackage.aiwd
    public final boolean f(Uri uri) {
        return ahmc.ag(uri).exists();
    }

    @Override // defpackage.aiwd
    public final OutputStream g(Uri uri) {
        File ag = ahmc.ag(uri);
        amcu.a(ag);
        return new aivp(new FileOutputStream(ag, true), ag);
    }

    @Override // defpackage.aiwd
    public final OutputStream h(Uri uri) {
        File ag = ahmc.ag(uri);
        amcu.a(ag);
        return new aivp(new FileOutputStream(ag), ag);
    }

    @Override // defpackage.aiwd
    public final void i(Uri uri) {
        File ag = ahmc.ag(uri);
        if (!ag.isDirectory()) {
            if (!ag.delete()) {
                if (!ag.exists()) {
                    throw new FileNotFoundException(String.format("%s does not exist", uri));
                }
                throw new IOException(String.format("%s could not be deleted", uri));
            }
            return;
        }
        throw new FileNotFoundException(String.format("%s is a directory", uri));
    }

    @Override // defpackage.aiwd
    public final void j(Uri uri, Uri uri2) {
        File ag = ahmc.ag(uri);
        File ag2 = ahmc.ag(uri2);
        amcu.a(ag2);
        if (ag.renameTo(ag2)) {
        } else {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.aiwd
    public final long m(Uri uri) {
        File ag = ahmc.ag(uri);
        if (ag.isDirectory()) {
            return 0L;
        }
        return ag.length();
    }

    @Override // defpackage.aiwd
    public final aivk n() {
        return this.a;
    }

    public aivb() {
        this(new aivk());
    }
}
