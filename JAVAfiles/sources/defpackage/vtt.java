package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtt implements wfd {
    private static final alwo a = alwo.o("BugleGroupManagement");
    private final vyv b;

    public vtt(vyv vyvVar) {
        this.b = vyvVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    @Override // defpackage.wfd
    public final void a() {
        if (!((Boolean) ((utz) vtr.b.get()).e()).booleanValue()) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationScheduler", "onRcsReady", 39, "RcsGroupIdentifiersTelephonyMigrationScheduler.java")).q("Skipping RCS group identifiers telephony batch migration. Disabled by phenotype.");
            return;
        }
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationScheduler", "onRcsReady", 44, "RcsGroupIdentifiersTelephonyMigrationScheduler.java")).q("Scheduling RCS group identifiers telephony batch migration.");
        ((uof) this.b.a.b()).b(upk.a("rcs_group_identifiers_telephony_migration", vts.a));
    }
}
