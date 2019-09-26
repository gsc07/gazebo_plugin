package cn.autolabor.plugin.gazebo.bean;

public class ServerInfo {
    private int version;
    private String processUUID;
    private String topic;
    private String zeromqAddress;
    private String nodeUUID;
    private String socketUUID;
    private String requestType;
    private String responseType;

    public ServerInfo() {
    }

    public ServerInfo(int version, String processUUID, String topic, String zeromqAddress, String nodeUUID, String socketUUID, String requestType, String responseType) {
        this.version = version;
        this.processUUID = processUUID;
        this.topic = topic;
        this.zeromqAddress = zeromqAddress;
        this.nodeUUID = nodeUUID;
        this.socketUUID = socketUUID;
        this.requestType = requestType;
        this.responseType = responseType;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getProcessUUID() {
        return processUUID;
    }

    public void setProcessUUID(String processUUID) {
        this.processUUID = processUUID;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getZeromqAddress() {
        return zeromqAddress;
    }

    public void setZeromqAddress(String zeromqAddress) {
        this.zeromqAddress = zeromqAddress;
    }

    public String getNodeUUID() {
        return nodeUUID;
    }

    public void setNodeUUID(String nodeUUID) {
        this.nodeUUID = nodeUUID;
    }

    public String getSocketUUID() {
        return socketUUID;
    }

    public void setSocketUUID(String socketUUID) {
        this.socketUUID = socketUUID;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    @Override
    public String toString() {
        return "ServerInfo{" + "version=" + version + ", processUUID='" + processUUID + '\'' + ", topic='" + topic + '\'' + ", zeromqAddress='" + zeromqAddress + '\'' + ", nodeUUID='" + nodeUUID + '\'' + ", socketUUID='" + socketUUID + '\'' + ", requestType='" + requestType + '\'' + ", responseType='" + responseType + '\'' + '}';
    }
}
