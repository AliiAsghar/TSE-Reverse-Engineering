package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.rcsservice.chatsession.MessageRevocationSupportedResult;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.group.GroupInfo;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForwardingChatSessionBinder extends IChatSession.Stub implements adud<IChatSession> {
    private IChatSession a;
    private final Context b;

    public ForwardingChatSessionBinder(Context context) {
        this.b = context;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult addUserToSession(long j, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // defpackage.adud
    public synchronized void clear() {
        this.a = null;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult endSession(long j) {
        return ((IChatSession) getDelegate()).endSession(j);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public long[] getActiveSessionIds() {
        return ((IChatSession) getDelegate()).getActiveSessionIds();
    }

    @Override // defpackage.adud
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return adom.v(this);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public GroupInfo getGroupInfo(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public long getPreferredSessionByUser(String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public String getRemoteUserId(long j) {
        return ((IChatSession) getDelegate()).getRemoteUserId(j);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult getSessionState(long j) {
        return ((IChatSession) getDelegate()).getSessionState(j);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public long[] getSessionsByUser(String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult getUpdatedGroupInfo(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public String[] getUsersInSession(long j) {
        return ((IChatSession) getDelegate()).getUsersInSession(j);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public boolean isGroupSession(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public MessageRevocationSupportedResult isMessageRevocationSupported(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult joinSession(long j) {
        return ((IChatSession) getDelegate()).joinSession(j);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult leaveSession(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult removeUserFromSession(long j, String str) {
        return ((IChatSession) getDelegate()).removeUserFromSession(j, str);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult reportRbmSpam(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult revokeMessage(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendGroupReport(long j, String str, String str2, long j2, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendIndicator(long j, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendMessage(long j, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendMessageTo(String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendPrivateIndicator(long j, String str, int i) {
        return ((IChatSession) getDelegate()).sendPrivateIndicator(j, str, i);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendPrivateMessage(long j, String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendReport(String str, String str2, String str3, long j, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendSuggestionPostBack(String str, String str2, String str3, String str4, String str5) {
        return ((IChatSession) getDelegate()).sendSuggestionPostBack(str, str2, str3, str4, str5);
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (IChatSession) iBinder;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult startGroupSession(String[] strArr) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult startGroupSessionWithMessage(String[] strArr, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult startGroupSessionWithMessageAndSubject(String[] strArr, ChatMessage chatMessage, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult startSessionWithMessage(String str, ChatMessage chatMessage) {
        return ((IChatSession) getDelegate()).startSessionWithMessage(str, chatMessage);
    }

    @Override // defpackage.adud
    public synchronized IChatSession getInterface() {
        return this.a;
    }
}
