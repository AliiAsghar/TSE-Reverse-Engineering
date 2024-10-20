package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivp extends aivt implements aivd, aivc {
    public final FileOutputStream a;
    private final File b;

    public aivp(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.aivc
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.aivd
    public final File b() {
        return this.b;
    }
}
