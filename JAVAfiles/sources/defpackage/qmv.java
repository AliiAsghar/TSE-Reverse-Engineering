package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qmv {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl");
    private final armf b;
    private final AtomicReference c;
    private final AtomicReference d;
    private final Set e;

    public qmv(armf armfVar, armf armfVar2, arwe arweVar, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = armfVar2;
        this.c = new AtomicReference(Instant.MIN);
        this.d = new AtomicReference(Instant.MIN);
        this.e = DesugarCollections.synchronizedSet(new HashSet());
    }

    public final void a() {
        alvw d = a.d();
        d.X(alwp.a, "BugleContacts");
        ((alvg) d.h("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl", "onContactsImportCompleted", 94, "ContactsImportResultTrackerImpl.kt")).q("Contacts import completed. Notifying pending future completers.");
        this.c.set(((xnv) this.b.b()).f());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((dtq) it.next()).b(true);
        }
        this.e.clear();
    }

    public final void b() {
        alvw d = a.d();
        d.X(alwp.a, "BugleContacts");
        ((alvg) d.h("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl", "onContactsImportFailed", 104, "ContactsImportResultTrackerImpl.kt")).q("Contacts import failed. Notifying pending future completers.");
        this.d.set(((xnv) this.b.b()).f());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((dtq) it.next()).b(false);
        }
        this.e.clear();
    }
}
