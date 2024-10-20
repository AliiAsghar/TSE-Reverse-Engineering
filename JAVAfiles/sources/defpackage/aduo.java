package defpackage;

import android.util.Xml;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduo {
    public static final acyz a = aczd.a(165911131);
    public final Map b = new HashMap();
    public final yjr c;
    public final adsj d;
    public String e;
    private final adih f;

    public aduo(adsj adsjVar, yjr yjrVar, adih adihVar) {
        this.d = adsjVar;
        this.c = yjrVar;
        this.f = adihVar;
    }

    public final Optional a(long j) {
        Optional ofNullable;
        synchronized (this.b) {
            ofNullable = Optional.ofNullable((adum) this.b.get(Long.valueOf(j)));
        }
        return ofNullable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r19.b.putAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        defpackage.advr.i(r0, "Error while closing file: %s", r0.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aduo.b():void");
    }

    public final void c(long j) {
        Long valueOf = Long.valueOf(j);
        advr.c("Removing group session information for session: %d", valueOf);
        synchronized (this.b) {
            if (this.b.remove(valueOf) == null) {
                return;
            }
            try {
                d();
            } catch (IOException unused) {
                advr.g("Error while storing group data", new Object[0]);
            }
        }
    }

    public final void d() {
        if (this.e == null) {
            advr.q("Filename was not generated. Cannot save groups.", new Object[0]);
            return;
        }
        synchronized (this.b) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = this.f.c(this.e);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(outputStream, "utf-8");
                    newSerializer.startDocument("utf-8", false);
                    newSerializer.startTag("urn:groupsinfo.jibemobile.com", "groups");
                    for (adum adumVar : this.b.values()) {
                        if (adumVar.b.isPresent()) {
                            newSerializer.startTag("urn:groupsinfo.jibemobile.com", "group");
                            newSerializer.attribute("", "key", String.valueOf(adumVar.a));
                            newSerializer.attribute("", "contributionId", adumVar.d);
                            if (adumVar.e.isPresent()) {
                                newSerializer.attribute("", "conferenceUri", (String) adumVar.e.get());
                            }
                            if (adumVar.f.isPresent()) {
                                newSerializer.attribute("", "subject", (String) adumVar.f.get());
                            }
                            if (adumVar.g.isPresent() && ((Long) adumVar.g.get()).longValue() > 0) {
                                newSerializer.attribute("", "removed", adumVar.g.get().toString());
                            }
                            if (adumVar.b.isPresent()) {
                                ((acop) adumVar.b.get()).d(newSerializer, "conference-info");
                            }
                            newSerializer.endTag("urn:groupsinfo.jibemobile.com", "group");
                        }
                    }
                    newSerializer.endTag("urn:groupsinfo.jibemobile.com", "groups");
                    newSerializer.endDocument();
                    newSerializer.flush();
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            advr.i(e, "Error while closing stream: %s", e.getMessage());
                        }
                    }
                } finally {
                }
            } catch (FileNotFoundException e2) {
                throw new IOException("File could not be opened", e2);
            }
        }
        advr.c("Groups saved", new Object[0]);
    }
}
