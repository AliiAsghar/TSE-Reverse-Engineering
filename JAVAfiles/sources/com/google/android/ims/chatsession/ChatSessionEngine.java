package com.google.android.ims.chatsession;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.rcsservice.chatsession.MessageRevocationSupportedResult;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.group.GroupInfo;
import defpackage.acni;
import defpackage.acnj;
import defpackage.acoc;
import defpackage.acyy;
import defpackage.acyz;
import defpackage.aczd;
import defpackage.adsj;
import defpackage.adtw;
import defpackage.advp;
import defpackage.advr;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apff;
import defpackage.apfh;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChatSessionEngine extends IChatSession.Stub {
    private final Context d;
    private acnj e;
    private final adsj f;
    public acoc rcsExtensionSender;
    static final acyz<Boolean> ENABLE_RECOVER_DISABLED_RCS_GROUPS_FROM_TELEPHONY = aczd.a(149786222);
    static final acyz<Boolean> ENABLE_CHAT_SESSION_ENGINE_SEND_REPORT_UNSUPPORTED = acyy.b("enable_ChatSessionEngine_sendReport_unsupported");
    static final acyz<Boolean> ENABLE_CHAT_SESSION_ENGINE_SEND_GROUP_REPORT_UNSUPPORTED = acyy.b("enable_ChatSessionEngine_sendGroupReport_unsupported");
    static final acyz<Boolean> enableChatSessionEngineLogIncomingRpcEvent = acyy.b("enable_chat_session_engine_log_incoming_rpc_event");
    static final acyz<Boolean> enableChatSessionEngineMethodsNotImplemented = acyy.b("enable_chat_session_engine_methods_not_implemented");
    private static final advp a = new advp("IChatSession");
    private static final String[] b = new String[0];
    private static final long[] c = new long[0];

    public ChatSessionEngine(Context context, adsj adsjVar, acoc acocVar) {
        this.d = context;
        this.f = adsjVar;
        this.rcsExtensionSender = acocVar;
    }

    private final void a(Optional optional, Optional optional2, int i) {
        aozy createBuilder = apff.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apff apffVar = (apff) createBuilder.b;
        apffVar.d = i - 1;
        apffVar.b |= 32;
        if (optional2.isPresent()) {
            String obj = optional2.get().toString();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apff apffVar2 = (apff) createBuilder.b;
            apffVar2.b |= 1;
            apffVar2.c = obj;
        }
        optional.isPresent();
        aozy createBuilder2 = apfh.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        apfh apfhVar = (apfh) apagVar;
        apfhVar.e = 1;
        apfhVar.b = 1 | apfhVar.b;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apfh apfhVar2 = (apfh) createBuilder2.b;
        apff apffVar3 = (apff) createBuilder.s();
        apffVar3.getClass();
        apfhVar2.d = apffVar3;
        apfhVar2.c = 101;
        this.rcsExtensionSender.e(this.d, (apfh) createBuilder2.s());
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult addUserToSession(long j, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult endSession(long j) {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            adtw.d(this.d, Binder.getCallingUid());
            acnj acnjVar = this.e;
            if (Objects.isNull(acnjVar)) {
                return new ChatSessionServiceResult(2);
            }
            try {
                return acnjVar.b(j);
            } catch (Exception e) {
                advr.i(e, "Error while ending chat session: %s", e.getMessage());
                return new ChatSessionServiceResult(1);
            }
        }
        throw new acni("endSession");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long[] getActiveSessionIds() {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            advr.d(a, "Starting get active sessions", new Object[0]);
            if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
                a(Optional.empty(), Optional.empty(), 7);
            }
            adtw.d(this.d, Binder.getCallingUid());
            return getActiveSessions();
        }
        throw new acni("getActiveSessionIds");
    }

    @Deprecated
    public long[] getActiveSessions() {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            acnj acnjVar = this.e;
            if (Objects.isNull(acnjVar)) {
                advr.h(a, "Error on getting sessions no chat session provider.", new Object[0]);
                return c;
            }
            advr.d(a, "Try get active sessions", new Object[0]);
            return acnjVar.j();
        }
        throw new acni("getActiveSessions");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public GroupInfo getGroupInfo(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long getPreferredSessionByUser(String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public String getRemoteUserId(long j) {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            advp advpVar = a;
            Long valueOf = Long.valueOf(j);
            advr.d(advpVar, "Starting getRemoteUserId for sessionId %s", valueOf);
            if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
                a(Optional.empty(), Optional.of(valueOf), 19);
            }
            adtw.d(this.d, Binder.getCallingUid());
            acnj acnjVar = this.e;
            if (Objects.isNull(acnjVar)) {
                advr.h(advpVar, "Could not get remote user id for sessionId %s no chat session provider.", valueOf);
                return null;
            }
            try {
                advr.d(advpVar, "Try getRemoteUserId for session %s", valueOf);
                return acnjVar.h(j);
            } catch (Exception e) {
                advr.i(e, "Error while getting remote user id: %s", e.getMessage());
                return null;
            }
        }
        throw new acni("getRemoteUserId");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult getSessionState(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long[] getSessionsByUser(String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult getUpdatedGroupInfo(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public String[] getUsersInSession(long j) {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            advp advpVar = a;
            Long valueOf = Long.valueOf(j);
            advr.d(advpVar, "Starting get users in session for session %s", valueOf);
            if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
                a(Optional.empty(), Optional.of(valueOf), 18);
            }
            adtw.d(this.d, Binder.getCallingUid());
            acnj acnjVar = this.e;
            if (Objects.isNull(acnjVar)) {
                advr.h(advpVar, "Could not get users in session for session id %s no chat session provider.", valueOf);
                return b;
            }
            try {
                advr.d(advpVar, "Try get users in session for session %s", valueOf);
                return acnjVar.k(j);
            } catch (Exception e) {
                advr.i(e, "Error while users in chat session: %s", e.getMessage());
                return b;
            }
        }
        throw new acni("getUsersInSession");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public boolean isGroupSession(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public MessageRevocationSupportedResult isMessageRevocationSupported(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult joinSession(long j) {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            adtw.d(this.d, Binder.getCallingUid());
            acnj acnjVar = this.e;
            if (Objects.isNull(acnjVar)) {
                return new ChatSessionServiceResult(2);
            }
            try {
                return acnjVar.c(j);
            } catch (Exception e) {
                advr.i(e, "Error while joining chat session: %s", e.getMessage());
                return new ChatSessionServiceResult(1);
            }
        }
        throw new acni("joinSession");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult leaveSession(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Deprecated
    public void registerProvider(acnj acnjVar) {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            this.e = acnjVar;
            return;
        }
        throw new acni("registerProvider");
    }

    @Deprecated
    public long registerSession(acnj acnjVar) {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            return this.f.a();
        }
        throw new acni("registerSession");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult removeUserFromSession(long j, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult reportRbmSpam(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult revokeMessage(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendGroupReport(long j, String str, String str2, long j2, int i) {
        throw new IllegalStateException("Method not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendIndicator(long j, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult sendMessage(long j, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendMessageTo(String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendPrivateIndicator(long j, String str, int i) {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            adtw.d(this.d, Binder.getCallingUid());
            acnj acnjVar = this.e;
            if (Objects.isNull(acnjVar)) {
                advr.h(a, "Unable to send private indicator, chat session provider not initialized.", new Object[0]);
                return new ChatSessionServiceResult(2);
            }
            try {
                advr.d(a, "Sending private indicator [%d]", Integer.valueOf(i));
                return acnjVar.l(j);
            } catch (Exception e) {
                advr.i(e, "Error while sending private indicator: %s", e.getMessage());
                return new ChatSessionServiceResult(1);
            }
        }
        throw new acni("sendPrivateIndicator");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult sendPrivateMessage(long j, String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendReport(String str, String str2, String str3, long j, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendSuggestionPostBack(String str, String str2, String str3, String str4, String str5) {
        throw new UnsupportedOperationException("sendSuggestionPostBack is deprecated");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSession(String[] strArr) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSessionWithMessage(String[] strArr, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSessionWithMessageAndSubject(String[] strArr, ChatMessage chatMessage, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult startSessionWithMessage(String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Deprecated
    public void unregisterProvider(acnj acnjVar) {
        if (!((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            this.e = null;
            return;
        }
        throw new acni("unregisterProvider");
    }

    @Deprecated
    public void unregisterSession(long j) {
    }
}
